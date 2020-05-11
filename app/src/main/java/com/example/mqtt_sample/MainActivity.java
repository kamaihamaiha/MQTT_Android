package com.example.mqtt_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mqtt_sample.service.MyMQTTService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyMQTTService.startService(this);

    }
}
