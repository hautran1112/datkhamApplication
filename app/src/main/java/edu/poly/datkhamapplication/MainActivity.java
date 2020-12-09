package edu.poly.datkhamapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Image imgBS, imgBN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.imgBacsi).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,BacsiActivity.class));
        });

        findViewById(R.id.imgBenhnhan).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, BenhnhanActivity.class));

        });

    }
}