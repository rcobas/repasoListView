package com.example.repasolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetallePlaneta extends AppCompatActivity implements View.OnClickListener {
    TextView tvnombre;
    ImageView ivImagen;
    ImageButton btAnterior;
    ImageButton btSiguiente;

    int[] galeria;
    int i = 0;
    int totalImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_planeta);

        tvnombre = (TextView) findViewById(R.id.tvDetalleNombre);
        ivImagen = (ImageView) findViewById(R.id.ivDetalleImagen);
        btAnterior = (ImageButton) findViewById(R.id.btAnterior);
        btSiguiente = (ImageButton) findViewById(R.id.btSiguiente);


        Bundle bundle = getIntent().getExtras();
        Planeta obj = (Planeta) bundle.getSerializable("planeta");

        galeria = obj.getGaleriaImagenes();
        totalImg = galeria.length;

        tvnombre.setText(obj.getNombre());
        ivImagen.setImageResource(obj.getImagen());

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {

            case R.id.btSiguiente:
                i++;
                if (i == totalImg)
                    i = 0;
                break;

            case R.id.btAnterior:
                i--;
                if (i == -1)
                    i = totalImg - 1;
                break;
        }

        ivImagen.setImageResource(galeria[i]);
    }
}