package com.spearbothy.googlearchitecture.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Handler;


/**
 * Created by mahao on 17-11-20.
 */

public class MyObserver implements LifecycleObserver {

    private Lifecycle mLifecycle;

    public MyObserver(Lifecycle mLifecycle) {
        this.mLifecycle = mLifecycle;
        // 添加监听
        this.mLifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        // 模拟网络请求，延时任务
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 检查当前activity的创建
                if (mLifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    // onResume之后， onPause()之前
                }
            }
        },2000);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {

    }
}
