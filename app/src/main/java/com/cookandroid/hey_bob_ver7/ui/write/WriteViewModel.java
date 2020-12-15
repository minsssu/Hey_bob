package com.cookandroid.hey_bob_ver7.ui.write;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WriteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WriteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}