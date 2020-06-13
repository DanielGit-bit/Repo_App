package com.example.appcompraonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import BD_TABLAS_USUARIO.Conexion_SQLITE_HELPER;


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

        //BOTONES INGRESAR-REGISTRARME
        ir_ingresar= findViewById(R.id.Boton_ir_ingresar);
        ir_registrarme = findViewById(R.id.Boton_ir_registrarse);
        ver_tiendas = findViewById(R.id.Boton_ver_tiendas);
       //SPINNER REGIONES-COMUNAS
        regiones=findViewById(R.id.spinner_Region);
        comunas=findViewById(R.id.spinner_comuna);

        Conexion_SQLITE_HELPER conexion=new Conexion_SQLITE_HELPER(this,"usuario",null,1);

    }

    public void Onclick(View view) {
        Intent miintent=new Intent(MainActivity.this,loginActivity.class);
        startActivity(miintent);

    }
    public void OnclckR(View view){

        Intent ir_Registro=new Intent(MainActivity.this,registrarse_Activity.class);
        startActivity(ir_Registro);
    }

}


