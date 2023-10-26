package com.example.interfaz_parcial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.navigation.Navigation;

import com.example.interfaz_parcial.data.InventarioDBHelper;

public class Registrarse extends AppCompatActivity {

    private EditText nombre;
    private EditText email;
    private EditText usuario;
    private EditText contraseña;
    private Button registrarBoton;
    private InventarioDBHelper baseDatos;
}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_iniciar_sesion, container, false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_iniciar_sesion, container, false);
    }

    @Override
    public void onClick(View view) {
        Cursor usuarioConsultado = baseDatos.getUsuarioByIdPassword( email.getText().toString(),
                contraseña.getText().toString());
        if (usuarioConsultado.moveToFirst()){
            Navigation.findNavController(view).navigate(R.id.menuPrincipalV2    );
        }else{
            Toast.makeText(getActivity(), "Datos incorrectos", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        nombre = (EditText) getView().findViewById( R.id.editTextText3 );
        email = (EditText) getView().findViewById( R.id.editTextText2 );
        usuario = (EditText) getView().findViewById( R.id.Codigo );
        contraseña = (EditText) getView().findViewById( R.id.edittextcontra );
        registrarBoton = (Button) getView().findViewById( R.id.botonin );
        baseDatos = new InventarioDBHelper( getContext() );

    }
}