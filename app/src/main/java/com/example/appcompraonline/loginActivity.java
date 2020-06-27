package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import OpenHelper.SQLITE_OpenHelper;

public class loginActivity extends AppCompatActivity {

    private EditText correo_electronico;
    private EditText contraseña;
    private Button ingresaru;
    private Button registrarse;
    SQLITE_OpenHelper helper=new SQLITE_OpenHelper(this,"BD1",null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Datos del usurario

        correo_electronico= findViewById(R.id.Correo_txt);
        contraseña = findViewById(R.id.Contraseña_txt);

        // Botones
        ingresaru=findViewById(R.id.Boton_Ingresar_U);
        registrarse=findViewById(R.id.Boton_ir_registrarse);

        ingresaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo_electronico=findViewById(R.id.Correo_txt);
                contraseña=findViewById(R.id.Contraseña_txt);
                try {
                    Cursor cursor=helper.consultar_Usu_Contr(correo_electronico.getText().toString(),contraseña.getText().toString());
                    if (cursor.getCount()>0){
                        Intent i= new Intent(getApplicationContext(),menu_logeadoActivity.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(getApplicationContext(),"Usuario y/o Contraseña incorrectos",Toast.LENGTH_LONG).show();
                    }
                    correo_electronico.setText("");
                    contraseña.setText("");
                    correo_electronico.findFocus();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void onclick(View view){
        Intent miintent=null;
        switch (view.getId()){
            case R.id.Boton_ir_registrarse:
                miintent=new Intent(loginActivity.this,registrarse_Activity.class);
                break;
        }
        startActivity(miintent);
    }

}

