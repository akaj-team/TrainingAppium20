def APP_MODULE = "Knavi"
def CHECK_SUITE_NAME = "CheckSuite"
def MAC_WORK_SPACE
def GIT_URL = "https://github.com/linkncom/knavi_appium.git"
def classification = evaluate readTrusted('classification.groovy')
def changeFeatures = ""
pipeline {
    agent none

    options {
        skipDefaultCheckout true
        preserveStashes(buildCount: 5)
    }

    stages {
        stage('Stash source code') {
            agent {
                label 'master'
            }
            steps {
                script {
                    if (env.CHANGE_ID != null) {
                        checkout $class: 'GitSCM',
                                branches: [[name: '*']],
                                extensions: [[$class: 'WipeWorkspace']],
                                userRemoteConfigs: [[refspec: "+refs/pull/${env.CHANGE_ID}/head:refs/remotes/origin/PR-${env.CHANGE_ID}", credentialsId: "github", url: GIT_URL]]
                        sh "git diff --diff-filter=ACM origin/master --name-only -- '*.feature' > feature.txt"
                        changeFeatures = readFile "${pwd()}/feature.txt"
                        changeFeatures = changeFeatures.trim().replaceAll('\n', ' ').replaceAll("${APP_MODULE}/", '')
                    } else {
                        checkout scm
                    }
                }
                stash includes: '**', excludes: 'appfile/**', name: 'source-code', useDefaultExcludes: false
                stash includes: "appfile/", name: 'data', useDefaultExcludes: false
            }
        }

        stage("Share data") {
            agent {
                label 'macos'
            }
            steps {
                unstash('data')
                script {
                    MAC_WORK_SPACE = pwd()
                }
            }
        }

        stage('Run Tests') {
            parallel {
                stage("Build") {
                    stages {
                        stage('Run cucumber') {
                            agent {
                                label 'master'
                            }

                            steps {
                                unstash('source-code')
                                sh "mvn clean test -DsuiteXmlFile='${CHECK_SUITE_NAME}' -DworkSpace='${MAC_WORK_SPACE}' -Dcucumber.options='${changeFeatures}'"
                            }
                            post {
                                always {
                                    archiveArtifacts artifacts: "${APP_MODULE}/target/cucumber-reports/,${APP_MODULE}/target/screenshots/,${APP_MODULE}/target/GitHubReport.json"
                                    junit "${APP_MODULE}/target/cucumber-reports/*.xml"
                                    script {
                                        classification.addClassification(APP_MODULE, "${APP_MODULE}/target/classifications/Android_Test.properties")
                                    }
                                    stash includes: "${APP_MODULE}/target/GitHubReport.json", name: 'cucumber-report'
                                    deleteDir()
                                }

                                success {
                                    echo "Test succeeded"
                                }
                                failure {
                                    echo "Test failed"
                                }
                            }
                        }
                        stage('Export reports') {
                            when {
                                not {
                                    environment name: 'CHANGE_ID', value: ''
                                }
                            }
                            agent {
                                docker {
                                    label 'master'
                                    image 'at/reporting:latest'
                                    args '-v $HOME/vendor/bundle:/vendor/bundle'
                                }
                            }
                            steps("Install gems") {
                                unstash('source-code')
                                unstash('cucumber-report')
                                sh "bundle install --path /vendor/bundle"
                            }
                            post {
                                always {
                                    sh "bundle exec danger --danger_id=cucumber_report --dangerfile=CucumberReport.Dangerfile"
                                    deleteDir()
                                }
                            }
                        }
                    }
                }

                stage('Validate code') {
                    when {
                        not {
                            environment name: 'CHANGE_ID', value: ''
                        }
                    }
                    stages {
                        stage('Validate') {
                            agent {
                                label 'master'
                            }
                            steps {
                                unstash('source-code')
                                sh "mvn install -DskipTests"
                                sh "mvn validate"
                            }
                            post {
                                always {
                                    stash includes: "${APP_MODULE}/target/checkstyle.xml", name: 'checkstyle'
                                    deleteDir()
                                }
                            }
                        }
                        stage('Reporting') {
                            agent {
                                docker {
                                    label 'master'
                                    image 'at/reporting:latest'
                                    args '-v $HOME/vendor/bundle:/vendor/bundle'
                                }
                            }
                            steps("Preparing source code & Installing gems") {
                                unstash('source-code')
                                unstash('checkstyle')
                                sh "gem -v"
                                sh "bundle install --path /vendor/bundle"
                            }
                            post {
                                success {
                                    sh "sed -i -E 's/@[0-9]*//' ${pwd()}/${APP_MODULE}/target/checkstyle.xml"
                                    sh "bundle exec danger --danger_id=check_style --dangerfile=Dangerfile"
                                    deleteDir()
                                }

                                failure {
                                    deleteDir()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
