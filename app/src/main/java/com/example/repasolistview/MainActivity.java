package com.example.repasolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Planeta> lista;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

        int[] galeriaMercurio = {R.drawable.mercurio, R.drawable.marte, R.drawable.venus};
        int[] galeriaVenus = {R.drawable.venus, R.drawable.marte, R.drawable.mercurio};
        int[] galeriaTierra = {R.drawable.tierra, R.drawable.marte, R.drawable.venus};
        int[] galeriaMarte = {R.drawable.marte, R.drawable.tierra, R.drawable.venus};

        lista = new ArrayList<Planeta>();
        lista.add(new Planeta("Mercurio", R.drawable.mercurio_icono, R.drawable.mercurio, galeriaMercurio));
        lista.add(new Planeta("Venus", R.drawable.venus_icono, R.drawable.venus, galeriaVenus));
        lista.add(new Planeta("Tierra", R.drawable.tierra_icono, R.drawable.tierra, galeriaTierra));
        lista.add(new Planeta("Marte", R.drawable.marte_icono, R.drawable.marte, galeriaMarte));

        adaptador = new Adaptador(getApplicationContext(), lista);
        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                Planeta planeta = (Planeta) parent.getItemAtPosition(pos);
                Intent i = new Intent(getApplicationContext(), DetallePlaneta.class);
                i.putExtra("planeta", planeta);
                startActivity(i);
            }
        });

    }
}