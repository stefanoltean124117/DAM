package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private double rez=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edittextnr1=findViewById(R.id.editTextNumber);
        EditText edittextnr2=findViewById(R.id.editTextNumber2);

        TextView textview=findViewById(R.id.textView);

        Button btnadd=findViewById(R.id.btnadd);
        Button btnsub=findViewById(R.id.btnsub);
        Button btnmul=findViewById(R.id.btnmul);
        Button btndiv=findViewById(R.id.btndiv);




        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nr1=Double.valueOf(edittextnr1.getText().toString());
                double nr2=Double.valueOf(edittextnr2.getText().toString());
                rez=nr1+nr2;
                textview.setText("Rezultat: "+rez);

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nr1=Double.valueOf(edittextnr1.getText().toString());
                double nr2=Double.valueOf(edittextnr2.getText().toString());
                rez=nr1-nr2;
                textview.setText("Rezultat: "+rez);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nr1=Double.valueOf(edittextnr1.getText().toString());
                double nr2=Double.valueOf(edittextnr2.getText().toString());
                rez=nr1*nr2;
                textview.setText("Rezultat: "+rez);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nr1=Double.valueOf(edittextnr1.getText().toString());
                double nr2=Double.valueOf(edittextnr2.getText().toString());
                if(nr2!=0)
                {
                    rez=nr1/nr2;
                    textview.setText("Rezultat: "+rez);
                    
                }
                else {
                    Toast.makeText(getApplicationContext(),"Nu se poate divide cu 0",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}