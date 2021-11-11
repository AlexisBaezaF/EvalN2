package com.example.evaln2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private NoticiaPublica noticia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void crearNoticia(View view){
        Intent intento = new Intent(this, CrearNoticia.class);
        startActivity(intento);
    }

    public void verBitacora(View view){
        Intent intento = new Intent(this, Bitacora.class);
        intento.putExtra("noticias", noticia.getNuevaNoticia());
        startActivity(intento);
    }

    public void cerrarSesion(View view){
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
        Toast.makeText(this, "Sesión cerrada correctamente.", Toast.LENGTH_SHORT).show();
    }
}