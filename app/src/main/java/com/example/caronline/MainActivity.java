package com.example.caronline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String[] carList ={"r","rl2","c","b"};
    int[] carImage ={R.drawable.r,R.drawable.rl2,R.drawable.c,R.drawable.b};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}