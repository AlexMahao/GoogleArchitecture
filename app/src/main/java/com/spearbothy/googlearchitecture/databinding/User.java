package com.spearbothy.googlearchitecture.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.spearbothy.googlearchitecture.BR;

/**
 * Created by mahao on 17-8-16.
 */

public class User extends BaseObservable {
    private String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
