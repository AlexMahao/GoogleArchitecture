package com.spearbothy.googlearchitecture.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.spearbothy.googlearchitecture.R;
import com.spearbothy.googlearchitecture.databinding.MainActivity;

/**
 * Created by mahao on 17-11-20.
 */

public class MyActivity extends AppCompatActivity {
    private MyObserver mObserver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        new MyAppObserver();
        mObserver = new MyObserver(getLifecycle());
    }

    public void to(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
