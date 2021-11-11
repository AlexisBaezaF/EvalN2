package com.example.evaln2;

import android.annotation.SuppressLint;
import android.media.Image;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Noticia implements Serializable {

    protected String titulo;
    protected String descripcion;
    protected String fecha;

    public Noticia(){
        titulo = "";
        descripcion = "";
        fecha = "Hoy";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }
}
