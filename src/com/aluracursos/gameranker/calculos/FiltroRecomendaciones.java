package com.aluracursos.gameranker.calculos;

public class FiltroRecomendaciones {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("¡Recomendación Épica! Altamente calificado.");
        }else if (clasificacion.getClasificacion() >= 2){
            System.out.println("¡Popular en el momento! Dale una oportunidad.");
        }else {
            System.out.println("Podría ser interesante. Añádelo a tu lista de pendientes.");
        }
    }
}