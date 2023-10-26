package com.example.interfaz_parcial.data;

import android.provider.BaseColumns;
public class UtensilioContract {
    public static abstract class UtensilioEntry implements BaseColumns{

        public static final String TABLE_NAME = "Utensilio";

        public static final String ID = "Codigo";

        public static final String NAME = "Descripcion";

        public static final String TIPO = "Tipo";

        public static final String CANTIDAD = "Cantidad";

        public static final String PRECIO = "Costo";
    }
}

