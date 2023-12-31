package com.example.interfaz_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {
    Button agregar;
    Button eliminar;
    Button editar;
    Button Listar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        agregar=(Button)findViewById(R.id.Botonagregar);
        agregar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Inicio.this, Agregar.class);
                startActivity(i);
            }
        });
        eliminar=(Button)findViewById(R.id.botoneliminar);
        eliminar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Inicio.this, Eliminar.class);
                startActivity(i);
            }
        });
        editar=(Button)findViewById(R.id.botoneditar);
        editar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Inicio.this, Editar.class);
                startActivity(i);
            }
        });
        Listar=(Button)findViewById(R.id.botonlistar);
        Listar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Inicio.this, Listar.class);
                startActivity(i);
            }
        });
    }
}