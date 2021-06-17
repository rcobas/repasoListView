package com.example.repasolistview;

import java.io.Serializable;

public class Planeta implements Serializable {

    private String nombre;

    private int simbolo;

    private int imagen;
    private int [] galeriaImagenes;

    public int[] getGaleriaImagenes() {
        return galeriaImagenes;
    }

    public void setGaleriaImagenes(int[] galeriaImagenes) {
        this.galeriaImagenes = galeriaImagenes;
    }

    public Planeta(String nombre, int simbolo, int imagen, int [] galeriaImagenes) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.imagen = imagen;
        this.galeriaImagenes = galeriaImagenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(int simbolo) {
        this.simbolo = simbolo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
