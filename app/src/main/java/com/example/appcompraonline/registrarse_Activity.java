package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import OpenHelper.SQLITE_OpenHelper;

public class registrarse_Activity extends AppCompatActivity {

    private EditText nombreu;
    private EditText apellidou;
    private EditText telefonou;
    private EditText direccionu;
    private EditText correo_Electronicou;
    private EditText contreñau;
    private Button registrarmeu;
    private Button btn_panta_tarjeta;

    SQLITE_OpenHelper helper=new SQLITE_OpenHelper(this,"BD1",null,1);

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
        btn_panta_tarjeta=findViewById(R.id.btn_panta_tarjeta);

        registrarmeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helper.abrir();
                helper.insertarReg(String.valueOf(nombreu.getText()),
                        String.valueOf(apellidou.getText()),
                        String.valueOf(telefonou.getText()),
                        String.valueOf(correo_Electronicou.getText()),
                        String.valueOf(contreñau.getText()));
                helper.cerrar();
                Toast.makeText(getApplicationContext(),"Usuario Registrado",Toast.LENGTH_LONG).show();

                Intent i= new Intent(getApplicationContext(),loginActivity.class);
                startActivity(i);
            }
        });

    }
}
