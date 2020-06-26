package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class agregar_metodo_pagoActivity extends AppCompatActivity {

    private EditText numero_tarjeta;
    private EditText fecha_caducidad;
    private EditText codigo_seguridad;
    private EditText nombre_titular;
    private EditText codigo_Postal;
    private Spinner paises;
    private CheckBox cuentarut;
    private CheckBox visa;
    private CheckBox mastercard;

    //Botones
    private Button confirmar_metodo;
    private Button no_añadir_tarjeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_metodo_pago);

        numero_tarjeta=findViewById(R.id.numero_tarjeta);
        fecha_caducidad=findViewById(R.id.fecha_caducidad);
       codigo_seguridad=findViewById(R.id.codigo_seguridad);
        nombre_titular=findViewById(R.id.nombre_titular);
        codigo_Postal=findViewById(R.id.codigo_postal);
        paises=findViewById(R.id.spinner_paises);
        confirmar_metodo=findViewById(R.id.btn_confirmar_tarjeta);
        no_añadir_tarjeta=findViewById(R.id.btn_no_añadir);
        //CHECKBOX TARJETAS
        cuentarut=findViewById(R.id.checkBox_cuentarut);
        visa=findViewById(R.id.checkBox_visa);
        mastercard=findViewById(R.id.checkBox_mastercard);


    }


}
