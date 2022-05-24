package com.myapps.myapps.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//Nama  : Fauzan Hilmy
//NIM   : 10119219
//Kelas : IF-6
//tanggal Pengerjaan : 24-05-2022
public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}