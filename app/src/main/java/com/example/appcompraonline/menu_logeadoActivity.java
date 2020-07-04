package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class menu_logeadoActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button verperfilp;
    private Button ver_carrito;
    private Button vertiendas2;
    private Spinner regiones2;
    private Spinner comunas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_logeado);

        verperfilp=findViewById(R.id.btn_ver_perfil);
        ver_carrito=findViewById(R.id.btn_mi_carrito);
        vertiendas2=findViewById(R.id.boton_ver_tiendas);

        regiones2=findViewById(R.id.spinner_region);
        comunas2=findViewById(R.id.spinner_comuna);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource
                (this,R.array.Array_Regiones,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        regiones2.setAdapter(adapter);
        regiones2.setOnItemSelectedListener(this);


        verperfilp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),editar_usuario.class);
                startActivity(i);
            }
        });

        ver_carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),carrito_comprasActivity.class);
                startActivity(i);
            }
        });
        vertiendas2.setOnClickListener(new View.OnClickListener() {
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
                R.array.Array_metropolitana, R.array.Array_arica,
                R.array.Array_tarapaca, R.array.Array_antofagasta,
                R.array.Array_atacama, R.array.Array_coquimbo,
                R.array.Array_valparaiso, R.array.Array_ohiggins,
                R.array.Array_maule, R.array.Array_Ñuble,
                R.array.Array_biobio, R.array.Array_araucania,
                R.array.Array_losrios, R.array.Array_loslagos,
                R.array.Array_aisen, R.array.Array_magallanes};
        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this,localidades[position],android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        comunas2.setAdapter(adapter);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
