package com.example.caronline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CarList extends AppCompatActivity {
    ImageView image1;
    ImageView image2;

    ImageView image3;
    ImageView image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);

//        image:4

        image4 =(ImageView) findViewById(R.id.image4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Form.class);
                startActivity(intent);

            }
        });

//        image:3
        image3 =(ImageView) findViewById(R.id.image3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Form.class);
                startActivity(intent);

            }
        });



//        image:2

        image2 =(ImageView) findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Form.class);
                startActivity(intent);

            }
        });


//        image:1
        image1 = (ImageView) findViewById(R.id.image1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Form.class);
                startActivity(intent);
            }
        });



    }
}