package com.example.interfaz_parcial.data;

import android.content.ContentValues;
import android.database.Cursor;

import com.example.interfaz_parcial.data.UtensilioContract.UtensilioEntry;

public class Utensilio {
    private int idUten;
    private String nombreUten;
    private String tipoUten;
    private int cantUten;
    private float precioUten;

    public Utensilio(int idUten, String nombreUten, String tipoUten, int cantUten, float precioUten){
        this.idUten = idUten;
        this.nombreUten = nombreUten;
        this.tipoUten = tipoUten;
        this.cantUten = cantUten;
        this.precioUten = precioUten;
    }

    public Utensilio(Cursor cursor){
        idUten = cursor.getInt( cursor.getColumnIndex( UtensilioEntry.ID ) );
        nombreUten = cursor.getString (cursor.getColumnIndex(UtensilioEntry.NAME ) );
        tipoUten  = cursor.getString (cursor.getColumnIndex(UtensilioEntry.TIPO ) );
        cantUten  = cursor.getInt (cursor.getColumnIndex(UtensilioEntry.CANTIDAD ) ));
        precioUten = cursor.getFloat (cursor.getColumnIndex(UtensilioEntry.PRECIO ) );

    }

    public ContentValues toContentValues(){
        ContentValues values = new ContentValues();
        values.put( UtensilioEntry.ID,idUten );
        values.put( UtensilioEntry.NAME,nombreUten );
        values.put( UtensilioEntry.TIPO, tipoUten );
        values.put( UtensilioEntry.CANTIDAD, cantUten );
        values.put( UtensilioEntry.PRECIO, precioUten );
        return  values;
    }

    public int getIdUten() {
        return idUten;
    }

    public void setIdUten(int idUten) {
        this.idUten = idUten;
    }

    public String getNombreUten() {
        return nombreUten;
    }

    public void setNombreUten(String nombreUten) {
        this.nombreUten = nombreUten;
    }

    public String getTipoUten() {
        return tipoUten;
    }

    public void setTipoUten(String tipoUten) {
        this.tipoUten = tipoUten;
    }

    public int getCantUten() {
        return cantUten;
    }

    public void setCantUten(int cantUten) {
        this.cantUten = cantUten;
    }

    public float getPrecioUten() {
        return precioUten;
    }

    public void setPrecioUten(float precioUten) {
        this.precioUten = precioUten;
    }
}

