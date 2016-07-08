package com.example.mylayout_land;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this,TextActivity.class);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            startActivity(intent);
            ;
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            startActivity(intent);
    }

}
