package com.i034114.quiz;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab_1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivityDos(view);

            }
        });


    }

    public void goActivityDos(View view){
        Intent intent = new Intent(this, pantalla2.class);
        startActivity(intent);
    }




    }

