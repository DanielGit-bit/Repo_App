package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class loginActivity extends AppCompatActivity {

    private EditText correo_electronico;
    private EditText contraseña;
    private Button ingresar;
    private Button registrarse;
    private ImageButton Volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Datos del usurario

        correo_electronico= findViewById(R.id.Correo_txt);
        contraseña = findViewById(R.id.Contraseña_txt);

        // Botones
        ingresar=findViewById(R.id.Boton_ir_ingresar);
        registrarse=findViewById(R.id.Boton_ir_registrarse);
        Volver=findViewById(R.id.Image_btn_regresar);
    }

    public void onclick(View view){
        Intent miintent=null;
        switch (view.getId()){
            case R.id.Image_btn_regresar:
                miintent=new Intent(loginActivity.this,MainActivity.class);
                break;
            case R.id.Boton_ir_registrarse:
                miintent=new Intent(loginActivity.this,registrarse_Activity.class);
                break;
        }
        startActivity(miintent);
    }

}

