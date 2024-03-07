package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText phonenr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phonenr=findViewById(R.id.editTextPhone);
        Button nextbtn=findViewById(R.id.btn_next2);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nr=phonenr.getText().toString();
                if(!nr.isEmpty())
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("PhoneNumber",nr);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this,"Please enter a phone number",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}