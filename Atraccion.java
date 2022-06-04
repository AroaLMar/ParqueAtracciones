package com.company;

public class Atraccion {

    private String nombre;
    private Integer estaturaMaxima;
    private Integer capacidadMaxima;

    @Override
    public String toString() {
        return "Atraccion{" +
                "Nombre=" + nombre + '\'' +
                ", estaturaMaxima=" + estaturaMaxima +
                ", capacidadMaxima=" + capacidadMaxima +
                ", duracion=" + duracion +
                "}";
    }

    private Integer duracion;


    public Atraccion(String nombre, Integer estaturaMaxima, Integer capacidadMaxima, Integer duracion) {
        this.nombre = nombre;
        this.estaturaMaxima = estaturaMaxima;
        this.capacidadMaxima = capacidadMaxima;
        this.duracion = duracion;
    }

}
