package com.aluracursos.gameranker.calculos;

import com.aluracursos.gameranker.modelos.Franquicia;
import com.aluracursos.gameranker.modelos.Videojuego;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Videojuego juego) {
        this.tiempoTotal += juego.getDuracionEnMinutos();
    }

    public void incluye(Franquicia franquicia) {
        this.tiempoTotal += franquicia.getDuracionEnMinutos();
    }
}