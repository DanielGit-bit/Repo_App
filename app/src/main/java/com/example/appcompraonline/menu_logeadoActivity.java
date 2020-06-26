package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu_logeadoActivity extends AppCompatActivity {

    private Button verperfilp;
    private Button ver_carrito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_logeado);

        verperfilp=findViewById(R.id.btn_ver_perfil);
        ver_carrito=findViewById(R.id.btn_mi_carrito);


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



    }



}
