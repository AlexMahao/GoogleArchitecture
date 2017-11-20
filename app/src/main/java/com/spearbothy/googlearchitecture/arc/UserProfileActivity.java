package com.spearbothy.googlearchitecture.arc;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.spearbothy.googlearchitecture.R;

/**
 * Created by mahao on 17-11-13.
 */

public class UserProfileActivity extends AppCompatActivity {

    private UserProfileViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel.class);
        // 初始化
        viewModel.init("123");

        viewModel.getUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {

            }
        });
    }

}
