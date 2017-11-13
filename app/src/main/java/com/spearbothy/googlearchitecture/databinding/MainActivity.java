package com.spearbothy.googlearchitecture.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.spearbothy.googlearchitecture.R;
import com.spearbothy.googlearchitecture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.add.setOnClickListener(this);

        User user = new User();
        user.setName("Blob");
        mBinding.setUser(user);
    }

    @Override
    public void onClick(View v) {
        mBinding.getUser().setName("Alex");
        mBinding.invalidateAll();
    }
}
