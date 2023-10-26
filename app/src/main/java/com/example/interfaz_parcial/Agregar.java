package com.example.interfaz_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Agregar extends AppCompatActivity {

    Button agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        agregar=(Button)findViewById(R.id.Botonagregar);
        agregar.setOnClickListener( new View.OnClickListener(){
            Intent i = new Intent(Inicio.this, Agregar.class);


        });
    }
}