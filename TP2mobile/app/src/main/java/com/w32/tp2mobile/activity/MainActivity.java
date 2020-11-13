package com.w32.tp2mobile.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.w32.tp2mobile.R;

public class MainActivity extends AppCompatActivity {

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message= findViewById(R.id.tvMessages);
    }

    public void onStartTempeture(){

    }

    public void onStartHumidity(){

    }
}