package com.example.evaln2;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{

    private ArrayList<Noticia> noticias;

    public adapter(ArrayList<Noticia> noticias){
        this.noticias = noticias;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(noticias.get(position).getTitulo());
        holder.descripcion.setText(noticias.get(position).getDescripcion());
        holder.fecha.setText(noticias.get(position).getFecha());
    }

    @Override
    public int getItemCount() {
        return noticias.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo;
        private TextView descripcion;
        private TextView fecha;

        public ViewHolder(View itemView){
            super(itemView);

            titulo = itemView.findViewById(R.id.titulo);
            descripcion = itemView.findViewById(R.id.descripcion);
            fecha = itemView.findViewById(R.id.fecha);
        }
    }
}
