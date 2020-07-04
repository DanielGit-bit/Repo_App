package com.example.appcompraonline;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import OpenHelper.BD_USUARIOS;

public class editar_usuario extends registrarse_Activity{


    private Button btn_actualizar;
    private Button btn_cancelar;
    ListView lv;
    ArrayList<String> lista;
    ArrayAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_usuario);
        btn_actualizar=findViewById(R.id.btn_editar);
        btn_cancelar=findViewById(R.id.btn_cancelar);

        lv=findViewById(R.id.lista);
        BD_USUARIOS db = new BD_USUARIOS(getApplicationContext(),"usuarios",null,1);
    }

}
