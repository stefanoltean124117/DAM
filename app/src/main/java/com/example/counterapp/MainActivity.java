package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textviewcount=findViewById(R.id.textView);



        Button btn_click=findViewById(R.id.button2);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textviewcount.setText(String.valueOf(count));
            }
        });

        Button btn_toast=findViewById(R.id.button);
        btn_toast.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Toast.makeText(getApplicationContext(),"Butonul count a fost apasat de "+count+" ori.",Toast.LENGTH_LONG).show();
            }

        });
    }
}