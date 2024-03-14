package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView timer;
    private Button btnstart,btnstop,btnreset;

    private long startime=0L;
    private long timeinmil=0L;
    private int updatetime=0;
    private int seconds,minutes,hours;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer=findViewById(R.id.textView);
        btnstart=findViewById(R.id.btn_start);
        btnstop=findViewById(R.id.btn_stop);
        btnreset=findViewById(R.id.btn_reset);

        handler=new Handler();

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startime==0L) {
                    startime =  System.currentTimeMillis();
                }else
                {
                    startime=System.currentTimeMillis()-timeinmil;
                }
                handler.post(runnable);
                btnstart.setEnabled(false);
                btnstop.setEnabled(true);
            }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(runnable);
                btnstart.setEnabled(true);
                btnstop.setEnabled(false);

            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(runnable);
                startime=0L;
                timeinmil=0L;
                updatetimertext();
                btnstart.setEnabled(true);
                btnstop.setEnabled(false);
            }
        });

        runnable=new Runnable() {
            @Override
            public void run() {
                timeinmil=System.currentTimeMillis()-startime;
                updatetimertext();
                handler.post(this);

            }
        };
    }

private void updatetimertext()
{
    seconds=(int)(timeinmil/1000);
    minutes=seconds/60;
    hours=minutes/60;
    seconds=seconds%60;
    minutes=minutes%60;

    String timertext=String.format("%02d:%02d:%02d",hours,minutes,seconds);
    timer.setText(timertext);
}
}