package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class agregar_metodo_pagoActivity extends AppCompatActivity {

    private EditText tarjeta_pago;
    private EditText dia_anio;
    private EditText codigo_tarjeta;
    private EditText nombre_titular;
    private EditText apellido_titular;
    private EditText codigo_Postal;
    private Spinner paises;

    //Botones
    private Button confirmar_metodo;
    private Button no_añadir_tarjeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_metodo_pago);

        tarjeta_pago=findViewById(R.id.tarjeta_pago);
        dia_anio=findViewById(R.id.dia_año);
       codigo_tarjeta=findViewById(R.id.codigo_tarjeta);
        nombre_titular=findViewById(R.id.nombre_titulartxt);
        apellido_titular=findViewById(R.id.apellido_titulartxt);
        codigo_Postal=findViewById(R.id.codigo_postal);
        paises=findViewById(R.id.spinner_paises);
        confirmar_metodo=findViewById(R.id.Confimar);
        no_añadir_tarjeta=findViewById(R.id.btn_no_añadir);


    }


}
