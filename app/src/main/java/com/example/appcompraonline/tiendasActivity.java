package com.example.appcompraonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tiendasActivity extends AppCompatActivity {

    private ImageButton volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas);

        volver=findViewById(R.id.btn_regresar);

    }
    public void  onclick(View view){


    }
}


