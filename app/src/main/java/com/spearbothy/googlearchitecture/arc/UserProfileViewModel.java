package com.spearbothy.googlearchitecture.arc;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

/**
 * Created by mahao on 17-11-13.
 */

public class UserProfileViewModel extends ViewModel {

    private LiveData<User> user;
    private UserRepository userRepo;

    @Inject // UserRepository parameter is provided by Dagger 2
    public UserProfileViewModel(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void init(String userId) {
        if (this.user != null) {
            return;
        }

        this.user = userRepo.getUser(userId);
    }

    public LiveData<User> getUser() {
        // 生命周期感知。。。
        return user;
    }
}
