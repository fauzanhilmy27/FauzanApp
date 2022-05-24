package com.myapps.myapps;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
//Nama  : Fauzan Hilmy
//NIM   : 10119219
//Kelas : IF-6
//tanggal Pengerjaan : 24-05-2022
public class VPAdapter extends FragmentStateAdapter {
    private String[] titles = new String[]{"fragment1","fragment2","fragment3"};

    public VPAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
            return new fragment1();
            case 1:
            return new fragment2();
            case 2:
                return new fragment3();
        }
        return new fragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
