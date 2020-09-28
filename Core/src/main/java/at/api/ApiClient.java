package at.api;

import at.base.Const;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * @author at-vinh.huynh
 */
public class ApiClient {
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
