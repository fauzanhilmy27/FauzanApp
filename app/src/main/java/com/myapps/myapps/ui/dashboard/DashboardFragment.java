package com.myapps.myapps.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.myapps.myapps.R;

import java.util.ArrayList;
import java.util.List;
//Nama  : Fauzan Hilmy
//NIM   : 10119219
//Kelas : IF-6
//tanggal Pengerjaan : 24-05-2022
public class DashboardFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }
}
