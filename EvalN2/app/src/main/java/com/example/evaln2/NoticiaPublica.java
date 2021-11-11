package com.example.evaln2;

import java.util.ArrayList;

public class NoticiaPublica {

    private ArrayList<Noticia> nuevaNoticia;

    public NoticiaPublica(){
        nuevaNoticia = new ArrayList<Noticia>();
    }

    public ArrayList<Noticia> getNuevaNoticia(){
        return nuevaNoticia;
    }
}
