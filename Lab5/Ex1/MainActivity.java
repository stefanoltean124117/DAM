package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private MyReceiver batteryreciever;
   private TextView batterytextview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batterytextview1 = findViewById(R.id.textview1);

        batteryreciever = new MyReceiver(batterytextview1);
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(batteryreciever, filter);
    }

        @Override
        protected void onDestroy()
        {
            super.onDestroy();
            unregisterReceiver(batteryreciever);
        }

    }
