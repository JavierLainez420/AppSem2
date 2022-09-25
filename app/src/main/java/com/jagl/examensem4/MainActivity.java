package com.jagl.examensem4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    public void salir(View view) {

        System.exit(0);
    }

    public void acercade(View view) {
        new AcercaDe(context);
    }

    public void ejercicio2(View view) {
        Intent intent = new Intent(this, Ejercicio2.class);
        intent.putExtra("valor","");
        startActivity(intent);
    }

    public void ejercicio1(View view) {
        Intent intent = new Intent(this, Ejercicio1.class);
        intent.putExtra("valor","");
        startActivity(intent);
    }
}