package com.spearbothy.googlearchitecture.arc;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by mahao on 17-11-13.
 */

public interface WebService {

    @GET("/users/{user}")
    Call<User> getUser(@Path("user") String userId);
}
