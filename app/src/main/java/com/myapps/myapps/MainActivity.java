package com.myapps.myapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Nama  : Fauzan Hilmy
//NIM   : 10119219
//Kelas : IF-6
//tanggal Pengerjaan : 24-05-2022
public class MainActivity extends AppCompatActivity {

    VPAdapter vpAdapter;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        viewPager2=findViewById(R.id.view_pager);

        vpAdapter=new VPAdapter(this);

        viewPager2.setAdapter(vpAdapter);

        Button button = (Button) findViewById(R.id.menu);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        });
    }
}