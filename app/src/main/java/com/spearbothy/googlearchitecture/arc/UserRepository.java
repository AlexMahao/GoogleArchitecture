package com.spearbothy.googlearchitecture.arc;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mahao on 17-11-13.
 */

public class UserRepository {

    private WebService webService;

    public LiveData<User> getUser(String userId) {
        final MutableLiveData<User> data = new MutableLiveData<>();
        webService.getUser(userId).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                // error case is left out for brevity
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
        return data;
    }
}
