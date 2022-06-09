package com.company;

public class Atraccion {

    private String nombre;
    private int estaturaMaxima;
    private int capacidadMaxima;
    private int duracion;


    public Atraccion(String nombre, int estaturaMaxima, int capacidadMaxima, int duracion) throws ParametrosNoValidos {
        this.nombre = nombre;
        if(nombre==null)throw new ParametrosNoValidos("El nombre no puede ser nulo");
        this.estaturaMaxima = estaturaMaxima;
        if(estaturaMaxima<=0) throw new ParametrosNoValidos("La estatura no puede ser menor o igual a 0");
        this.capacidadMaxima = capacidadMaxima;
        if(capacidadMaxima<=0) throw new ParametrosNoValidos("La capacidad no puede ser menor o igual a 0");
        this.duracion = duracion;
        if(duracion<=0) throw new ParametrosNoValidos("La duracion no puede ser menor o igual a 0");

    }

    @Override
    public String toString() {
        return "Atraccion{" +
                "Nombre=" + nombre + '\'' +
                ", estaturaMaxima=" + estaturaMaxima +
                ", capacidadMaxima=" + capacidadMaxima +
                ", duracion=" + duracion +
                "}";
    }

}
