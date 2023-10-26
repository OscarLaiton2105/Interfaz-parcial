package com.example.interfaz_parcial.data;

import android.content.ContentValues;
import android.database.Cursor;

import java.sql.Date;

import com.example.interfaz_parcial.data.TansaccionesContract.TransaccionesEntry;
import com.example.interfaz_parcial.data.UsuarioContract.UsuarioEntry;
import com.example.interfaz_parcial.data.UtensilioContract.UtensilioEntry;

public class Transacciones {
    private int id_us;
    private int id_ut;
    private String fecha_entrada;
    private String fecha_salida;
    private int cantidadTra;

    public Transacciones(int id_us, int id_ut, String fecha_entrada, String fecha_salida, int cantidadTra){
        this.id_us = id_us;
        this.id_ut = id_ut;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.cantidadTra = cantidadTra;
    }
    public Transacciones(Cursor cursor){
        id_us = cursor.getInt( cursor.getColumnIndex(UsuarioEntry.ID ) );
        id_ut = cursor.getInt (cursor.getColumnIndex(UtensilioEntry.ID ) );
        fecha_entrada  = cursor.getString (cursor.getColumnIndex(TransaccionesEntry.FECHA_ENTRADA ) ));
        fecha_salida  = cursor.getString (cursor.getColumnIndex(TransaccionesEntry.FECHA_SALIDA ) ));
        cantidadTra = cursor.getInt(cursor.getColumnIndex(TransaccionesEntry.CANTIDAD_TRA ) );
    }
    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(TransaccionesEntry.ID_US, id_us);
        values.put(TransaccionesEntry.ID_UT, id_ut);
        values.put(TransaccionesEntry.FECHA_ENTRADA, fecha_entrada);
        values.put(TransaccionesEntry.FECHA_SALIDA, fecha_salida);
        values.put(TransaccionesEntry.CANTIDAD_TRA, cantidadTra);
        return values;
    }

    public int getId_us() {
        return id_us;
    }

    public void setId_us(int id_us) {
        this.id_us = id_us;
    }

    public int getId_ut() {
        return id_ut;
    }

    public void setId_ut(int id_ut) {
        this.id_ut = id_ut;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getCantidadTra() {
        return cantidadTra;
    }

    public void setCantidadTra(int cantidadTra) {
        this.cantidadTra = cantidadTra;
    }
}
