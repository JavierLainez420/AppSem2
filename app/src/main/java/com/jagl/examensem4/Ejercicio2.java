package com.jagl.examensem4;

import static java.lang.Math.PI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

public class Ejercicio2 extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        et1 = findViewById(R.id.etAltura);
        et2 = findViewById(R.id.etRadio);
        tv1 = findViewById(R.id.tvResultado);

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

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        float h = Float.parseFloat(valor1);
        float r = Float.parseFloat(valor2);
        float resultado;

        resultado = (float) ((r * r) * PI * h  );

        String resu = String.valueOf(resultado);

        tv1.setText(resu);
        Toast.makeText(this, "Volumen calculado exitosamente", Toast.LENGTH_SHORT).show();


    }
}