package com.example.appcompraonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
    private Button ir_ingresar;
    private Button ir_registrarme;
    private Button ver_tiendas;

    private Spinner regiones;
    private Spinner comunas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SPINNER REGIONES-COMUNAS
        regiones=findViewById(R.id.spinner_Region);
        comunas=findViewById(R.id.Spinner_comunas);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource
                (this,R.array.Array_Regiones,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        regiones.setAdapter(adapter);
        regiones.setOnItemSelectedListener(this);

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

        ir_registrarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),registrarse_Activity.class);
                startActivity(i);
            }
        });

        ver_tiendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int[]localidades={
                R.array.Array_Metropolitana, R.array.Array_Arica,
                R.array.Array_Tarapaca, R.array.Array_Antofagasta,
                R.array.Array_Atacama, R.array.Array_Coquimbo,
                R.array.Array_Valparaiso, R.array.Array_Ohiggins,
                R.array.Array_Maule, R.array.Array_ñuble,
                R.array.Array_Biobio, R.array.Array_Araucania,
                R.array.Array_Losrios, R.array.Array_Loslagos,
                R.array.Array_Aisen, R.array.Array_Magallanes};
        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this,localidades[position],android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        comunas.setAdapter(adapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


