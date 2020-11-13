package com.w32.tp2mobile.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.w32.tp2mobile.R;
import com.w32.tp2mobile.model.SensorValue;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private TextView message;
    private SensorData temperatureData = new SensorData(SensorID)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message= findViewById(R.id.tvMessages);


        InputStream theJSON = new FileInputStream("humidity.json");
         = objectMapper.readValue(theJSON, Individu.class);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            SensorValue sensorValue = objectMapper.readValue(theJSON, SensorValue.class);
        } catch (JsonParseException | JsonMappingException e) {
            e.printStackTrace();
        }
    }

    public void onStartTempeture(){

    }

    public void onStartHumidity(){

    }
}