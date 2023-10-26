package com.example.interfaz_parcial.data;

import android.provider.BaseColumns;
public class TansaccionesContract {
    public static abstract class TransaccionesEntry implements BaseColumns{
        public static final String TABLE_NAME = "Transacciones";
        public static final String ID_US= "Cedula";
        public static final String ID_UT = "Codigo";
        public static final String FECHA_ENTRADA = "Fecha de entrada";
        public static final String FECHA_SALIDA = "Fecha de salida";
        public static final String CANTIDAD_TRA = "Cantida";
    }
}

