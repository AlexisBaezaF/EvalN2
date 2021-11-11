package com.example.evaln2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Bitacora extends AppCompatActivity {

    private ArrayList<Noticia> noticias;
    private RecyclerView recycler;
    private adapter a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitacora);

        noticias = (ArrayList<Noticia>) getIntent().getSerializableExtra("noticias");
        recycler = findViewById(R.id.recyclerBitacora);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        a = new adapter(noticias);
        recycler.setAdapter(a);
    }
}