package com.aluracursos.gameranker;

import com.aluracursos.gameranker.calculos.CalculadoraDeTiempo;
import com.aluracursos.gameranker.calculos.FiltroRecomendaciones;
import com.aluracursos.gameranker.modelos.DLC;
import com.aluracursos.gameranker.modelos.Franquicia;
import com.aluracursos.gameranker.modelos.Videojuego;

public class Principal {
    public static void main(String[] args) {
        // Ejemplo de un Videojuego
        Videojuego godOfWar2018 = new Videojuego();
        godOfWar2018.setNombre("God of War (2018)");
        godOfWar2018.setFechaDeLanzamiento(2018);
        godOfWar2018.setDuracionEnMinutos(25 * 60); // 25 horas
        godOfWar2018.setIncluidoEnElPlan(true);
        godOfWar2018.setDesarrollador("Santa Monica Studio");
        godOfWar2018.setPlataforma("PlayStation 4, PC");

        System.out.println("--- Ficha Técnica de Videojuego ---");
        godOfWar2018.muestraFichaTecnica();
        godOfWar2018.evalua(9.5);
        godOfWar2018.evalua(10);
        godOfWar2018.evalua(9.8);
        System.out.println("Total de evaluaciones: " + godOfWar2018.getTotalDeLasEvaluaciones());
        System.out.println("Media de evaluaciones: " + godOfWar2018.calculaMedia());
        System.out.println("Clasificación GameRanker: " + godOfWar2018.getClasificacion());

        System.out.println("\n--- Otro Videojuego ---");
        Videojuego theWitcher3 = new Videojuego();
        theWitcher3.setNombre("The Witcher 3: Wild Hunt");
        theWitcher3.setFechaDeLanzamiento(2015);
        theWitcher3.setDuracionEnMinutos(100 * 60); // 100 horas
        theWitcher3.setIncluidoEnElPlan(false);
        theWitcher3.setDesarrollador("CD Projekt Red");
        theWitcher3.setPlataforma("PC, PlayStation, Xbox, Switch");
        theWitcher3.muestraFichaTecnica();
        theWitcher3.evalua(9.9);
        theWitcher3.evalua(10);
        System.out.println("Media de evaluaciones: " + theWitcher3.calculaMedia());


        // Ejemplo de una Franquicia
        System.out.println("\n--- Ficha Técnica de Franquicia ---");
        Franquicia godOfWarSaga = new Franquicia();
        godOfWarSaga.setNombre("God of War Saga");
        godOfWarSaga.setFechaDeLanzamiento(2005); // Año del primer juego
        godOfWarSaga.setCantidadJuegos(7); // Ej. GOW1, GOW2, GOW3, Ascension, PSPs, GOW2018, Ragnarok
        godOfWarSaga.setHorasPorJuego(20); // Promedio de horas por juego
        godOfWarSaga.muestraFichaTecnica();

        // Calculadora de Tiempo de Juego
        System.out.println("\n--- Calculando Tiempo de Juego ---");
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(godOfWar2018);
        calculadora.incluye(theWitcher3);
        calculadora.incluye(godOfWarSaga);
        System.out.println("Tiempo total necesario para jugar tus títulos favoritos: " + calculadora.getTiempoTotal() + " minutos.");

        // Filtro de Recomendaciones
        System.out.println("\n--- Filtro de Recomendaciones ---");
        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(godOfWar2018);

        // Ejemplo de DLC
        System.out.println("\n--- DLC y su Clasificación ---");
        DLC dlcValhalla = new DLC();
        dlcValhalla.setNumero(1);
        dlcValhalla.setNombre("Valhalla (God of War Ragnarok DLC)");
        dlcValhalla.setJuegoBase(godOfWar2018);
        dlcValhalla.setTotalDescargas(800000);

        filtroRecomendaciones.filtra(dlcValhalla);

        DLC dlcMenosPopular = new DLC();
        dlcMenosPopular.setNumero(2);
        dlcMenosPopular.setNombre("DLC Menos popular");
        dlcMenosPopular.setJuegoBase(godOfWar2018);
        dlcMenosPopular.setTotalDescargas(50000);

        filtroRecomendaciones.filtra(dlcMenosPopular);

    }
}