package com.example.myapplication;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.BatteryManager;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MyReceiver extends BroadcastReceiver {
    private TextView batterytextview;
    public MyReceiver(TextView textview)
    {
        this.batterytextview=textview;
    }


    @Override
    public void onReceive(Context context, Intent intent)
    {if(Intent.ACTION_BATTERY_CHANGED.equals(intent.getAction())) {
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
        float battery = level / (float) scale;

        String batterystatus="Battery levels: "+(battery*100)+" %";
        batterytextview.setText(batterystatus);
        if(battery*100<15)
        {
            Toast.makeText(context,"Battery is low!",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"Status received.");
        }



    }

    }
}
