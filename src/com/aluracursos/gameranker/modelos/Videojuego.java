package com.aluracursos.gameranker.modelos;

import com.aluracursos.gameranker.calculos.Clasificacion;

public class Videojuego extends Titulo implements Clasificacion {
    private String desarrollador;
    private String plataforma;

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public int getClasificacion() {
        if (getTotalDeLasEvaluaciones() == 0) return 0;
        return (int) calculaMedia() / 2;
    }
}