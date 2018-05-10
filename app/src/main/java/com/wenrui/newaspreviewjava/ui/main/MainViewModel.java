package com.wenrui.newaspreviewjava.ui.main;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public final MutableLiveData<User> liveData = new MutableLiveData<>();

    public MainViewModel() {
    }

    public void start(User user) {
        liveData.setValue(user);
    }

    public void increaseUserId() {
        User user = liveData.getValue();
        user.increaseId();
        liveData.setValue(user);
    }
}
