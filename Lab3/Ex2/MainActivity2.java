package com.example.ex2_mybook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private int current_chapter=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button nextButton=findViewById(R.id.btn_next);

        Button backButton=findViewById(R.id.btn_back);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                if(current_chapter==1)
                {
                    current_chapter++;
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentContainerView,Fragmentcap2.class,null)
                            .setReorderingAllowed(true)
                            .addToBackStack("name")
                            .commit();

                }else if(current_chapter==2)
                {current_chapter++;
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentContainerView,Fragmentcap3.class,null)
                            .setReorderingAllowed(true)
                            .addToBackStack("name")
                            .commit();

                }else if(current_chapter==3)
                {current_chapter++;
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentContainerView,Fragmentcap4.class,null)
                            .setReorderingAllowed(true)
                            .addToBackStack("name")
                            .commit();

                }else if(current_chapter==4)
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current_chapter==1)
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);

                }

                else if(current_chapter==2)
                { getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView,Fragmentcap1.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                    current_chapter--;

                }
                else if(current_chapter==3)
                {getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView,Fragmentcap2.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                    current_chapter--;

                }
                else if(current_chapter==4)
                {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentContainerView,Fragmentcap3.class,null)
                            .setReorderingAllowed(true)
                            .addToBackStack("name")
                            .commit();
                    current_chapter--;
                }
            }
        });

    }
}