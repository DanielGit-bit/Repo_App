package com.example.appcompraonline;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import OpenHelper.BD_USUARIOS;


public class editar_usuario extends registrarse_Activity{


    private Button btn_actualizar;
    private Button btn_cancelar;
    private EditText correou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_usuario);
        btn_actualizar=findViewById(R.id.btn_editar);
        btn_cancelar=findViewById(R.id.btn_cancelar);
        correou=findViewById(R.id.edit_correo);

    }

    public void buscar (View view){
        BD_USUARIOS helper=new BD_USUARIOS(this,"usuario",null,1);
        SQLiteDatabase bd_usuario=helper.getReadableDatabase();
        String correo=correou.getText().toString();
        if(!correo.isEmpty()){

        }else{
            Toast.makeText(getApplicationContext(),"gtgt",Toast.LENGTH_LONG).show();
        }


    }

}
