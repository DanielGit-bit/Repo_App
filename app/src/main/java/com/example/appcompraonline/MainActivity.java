package com.example.appcompraonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity  {
    private Button ir_ingresar;
    private Button ir_registrarme;
    private Spinner regiones;
    private Spinner comunas;
    private Button ver_tiendas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SPINNER REGIONES-COMUNAS
        regiones=findViewById(R.id.spinner_Region);
        comunas=findViewById(R.id.spinner_comuna);


        //BOTONES INGRESAR-REGISTRARME
        ir_ingresar= findViewById(R.id.Boton_ir_ingresar);
        ir_registrarme = findViewById(R.id.Boton_ir_registrarse);
        ver_tiendas = findViewById(R.id.Boton_ver_tiendas);

        ir_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),loginActivity.class);
                startActivity(i);
            }
        });


    }
}


