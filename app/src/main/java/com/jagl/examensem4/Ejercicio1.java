package com.jagl.examensem4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Ejercicio1 extends AppCompatActivity {
    private EditText et1,et2,et3;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        et1 = findViewById(R.id.etAños);
        et2 = findViewById(R.id.etCapital);
        et3 = findViewById(R.id.etInteres);

        context = this;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.menu_principal){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("valor","");
            startActivity(intent);

        }
        else if(id==R.id.menu_v1){
            Intent intent = new Intent(this, Ejercicio1.class);
            intent.putExtra("valor","");
            startActivity(intent);
            return true;
        }else if (id==R.id.menu_v2){
            Intent intent = new Intent(this, Ejercicio2.class);
            intent.putExtra("valor","");
            startActivity(intent);

            return true;
        }else if (id==R.id.menu_v3){
            new AcercaDe(context);


            return true;
        }
        else if(id == R.id.menu_salir){

            System.exit(0);

        }

        return super.onOptionsItemSelected(item);
    }

    public void calcular(View view) {
        String años = et1.getText().toString();
        String capital = et2.getText().toString();
        String interes = et3.getText().toString();
        Intent intent = new Intent(this, VistaPrueba.class);

        intent.putExtra("años", años);
        intent.putExtra("capital", capital);
        intent.putExtra("interes", interes);

        startActivity(intent);


    }
}