package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import BD_TABLAS_USUARIO.Conexion_SQLITE_HELPER;
import Utilidades.Utilidades;


public class registrarse_Activity extends AppCompatActivity {

    private EditText nombreu;
    private EditText apellidou;
    private EditText telefonou;
    private EditText direccionu;
    private EditText correo_Electronicou;
    private EditText contreñau;
    private Button registrarmeu;
    private ImageButton volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse_);

        //Edit text
          nombreu=findViewById(R.id.Nombre_txt);
          apellidou=findViewById(R.id.Apellido_txt);
          telefonou=findViewById(R.id.Telefono_txt);
          correo_Electronicou=findViewById(R.id.Correo_txt);
          contreñau=findViewById(R.id.Contraseña_txt);
          // Boton
        registrarmeu=findViewById(R.id.Boton_registrar_C);
        volver=findViewById(R.id.imagen_btn_regresarR);

    }

    public void onclick(View view){
        registrar_usuario();

    }

    private void registrar_usuario() {

        Conexion_SQLITE_HELPER conexion=new Conexion_SQLITE_HELPER(this,"usuario",null,1);

        SQLiteDatabase db=conexion.getWritableDatabase();

        ContentValues values=new ContentValues();
        //values.put(Utilidades.CAMPO_ID,nombreu.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE,nombreu.getText().toString());
        values.put(Utilidades.CAMPO_APELLIDO,apellidou.getText().toString());
        values.put(Utilidades.CAMPO_TELEFONO,telefonou.getText().toString());
        values.put(Utilidades.CAMPO_CORREO,correo_Electronicou.getText().toString());
        values.put(Utilidades.CAMPO_CONTRASENA,contreñau.getText().toString());

        long idresultante=db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_ID,values);

        Toast.makeText(getApplicationContext(),"id registro: "+idresultante,Toast.LENGTH_SHORT).show();
        db.close();

    }


}
