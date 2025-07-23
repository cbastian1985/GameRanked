package com.aluracursos.gameranker.modelos;

import com.aluracursos.gameranker.calculos.Clasificacion;

public class DLC implements Clasificacion {
    private int numero;
    private String nombre;
    private Videojuego juegoBase;
    private int totalDescargas;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Videojuego getJuegoBase() {
        return juegoBase;
    }

    public void setJuegoBase(Videojuego juegoBase) {
        this.juegoBase = juegoBase;
    }

    public int getTotalDescargas() {
        return totalDescargas;
    }

    public void setTotalDescargas(int totalDescargas) {
        this.totalDescargas = totalDescargas;
    }

    @Override
    public int getClasificacion() {
        if (totalDescargas > 500000) {
            return 5;
        } else if (totalDescargas > 100000) {
            return 3;
        } else {
            return 1;
        }
    }
}