package com.spearbothy.googlearchitecture.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.spearbothy.googlearchitecture.R;
import com.spearbothy.googlearchitecture.databinding.ActivityDemo1Binding;

/**
 * Created by mahao on 17-8-22.
 */

public class Demo1Activity extends AppCompatActivity implements View.OnClickListener {
    // 辅助类，用以数据绑定
    ActivityDemo1Binding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 构造辅助类对象
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_demo_1);
        // 对按钮设置监听
        mBinding.add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mBinding.setClickNum(mBinding.getClickNum() + 1);
    }
}
