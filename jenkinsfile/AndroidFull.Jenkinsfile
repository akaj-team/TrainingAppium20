def APP_MODULE = "Knavi"
def ANDROID_SUITE_NAME = "AndroidSuite"
def MAC_WORK_SPACE
def notify = evaluate readTrusted('notify.groovy')
def classification = evaluate readTrusted('classification.groovy')
pipeline {
    agent none

    options { preserveStashes(buildCount: 5) }

    stages {
        stage('Stash data') {
            agent {
                label 'master'
            }

            steps {
                stash includes: '**', name: 'source-code', useDefaultExcludes: false
                stash includes: "appfile/", name: 'data', useDefaultExcludes: false
            }
        }

        stage("Share data") {
            agent {
                label 'macos'
            }

            options { skipDefaultCheckout() }

            steps {
                unstash('data')
                script {
                    MAC_WORK_SPACE = pwd()
                }
            }
        }
        stage('Run cucumber') {
            agent {
                label 'master'
            }

            options { skipDefaultCheckout() }

            steps {
                unstash('source-code')
                sh "mvn clean test -DsuiteXmlFile='${ANDROID_SUITE_NAME}' -DworkSpace='${MAC_WORK_SPACE}'"
            }
            post {
                always {
                    archiveArtifacts artifacts: "${APP_MODULE}/target/cucumber-reports/,${APP_MODULE}/target/screenshots/,${APP_MODULE}/target/GitHubReport.json"
                    junit "${APP_MODULE}/target/cucumber-reports/*.xml"
                    script {
                        def androidPropertyFile = "${APP_MODULE}/target/classifications/Android_Test.properties"
                        classification.addClassification(APP_MODULE, androidPropertyFile)
                        notify.sendMessage(APP_MODULE, androidPropertyFile)
                    }
                    stash includes: "${APP_MODULE}/target/GitHubReport.json", name: 'cucumber-report'
                    deleteDir()
                }

                success {
                    echo "Test succeeded"
                }
                failure {
                    echo "Test failed"
                    script {
                        notify.cucumberFailed("${APP_MODULE}/target/classifications/Android_Test.properties")
                    }
                }
            }
        }
    }
}
