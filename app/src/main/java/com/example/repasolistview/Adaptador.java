package com.example.repasolistview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    Context miContexto;
    ArrayList<Planeta> miLista;

    public Adaptador(Context miContexto, ArrayList<Planeta> miLista) {
        this.miContexto = miContexto;
        this.miLista = miLista;
    }

    @Override
    public int getCount() {
        return miLista.size();
    }

    @Override
    public Object getItem(int i) {
        return miLista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return miLista.get(i).getSimbolo();
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater inflador = LayoutInflater.from(miContexto);
        view = inflador.inflate(R.layout.itemlistview, null);

        ImageView imagen = (ImageView) view.findViewById(R.id.ivImagen);
        TextView nombre = (TextView) view.findViewById(R.id.tvNombre);
        ImageView icono = (ImageView) view.findViewById(R.id.ivIcono);

        nombre.setText(miLista.get(i).getNombre());
        imagen.setImageResource(miLista.get(i).getImagen());
        icono.setImageResource(miLista.get(i).getSimbolo());


        return view;
    }
}
