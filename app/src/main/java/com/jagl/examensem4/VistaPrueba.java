package com.jagl.examensem4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class VistaPrueba extends AppCompatActivity {
    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_prueba);
        tv1 = findViewById(R.id.tvdatos);

        String años = getIntent().getStringExtra("años");
        String capital = getIntent().getStringExtra("capital");
        String interes = getIntent().getStringExtra("interes");

        int añoss = Integer.parseInt(años);
        float capitall = Integer.parseInt(capital);
        float interessin = Integer.parseInt(interes);
        float capitalfin;
        float intereses;

        for ( int i = 1; i <= añoss; i++ ){

            intereses = capitall * interessin / 100;
            capitalfin = capitall + intereses;

            tv1.append("         "+ i + "           " + capitall + "         " + intereses + "\n");

            capitall = capitalfin;

        }

    }






}