package com.aluracursos.gameranker.modelos;

public class Franquicia extends Titulo {
    private int cantidadJuegos;
    private int horasPorJuego;

    public int getCantidadJuegos() {
        return cantidadJuegos;
    }

    public void setCantidadJuegos(int cantidadJuegos) {
        this.cantidadJuegos = cantidadJuegos;
    }

    public int getHorasPorJuego() {
        return horasPorJuego;
    }

    public void setHorasPorJuego(int horasPorJuego) {
        this.horasPorJuego = horasPorJuego;
    }

    @Override
    public void muestraFichaTecnica() {
        System.out.println("Nombre de la Franquicia: " + this.getNombre());
        System.out.println("Año de inicio: " + this.getFechaDeLanzamiento());
        System.out.println("Cantidad de juegos principales: " + this.getCantidadJuegos());
        System.out.println("Duración total estimada de la franquicia: " + this.getDuracionEnMinutos() + " minutos");
    }

    public int getDuracionEnMinutos() {
        return cantidadJuegos * horasPorJuego * 60;
    }
}