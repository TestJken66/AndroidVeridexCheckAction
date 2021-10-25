package me.hhhaiai.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import me.sdk.dev.Los;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Los.i("onCrete");
    }
}