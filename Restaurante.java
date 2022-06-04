package com.company;

import java.sql.Time;

public class Restaurante {

    private String nombre;
    private int horarioInicio;
    private int horarioFin;
    private double precioMedioPersona;


    public Restaurante(String nombre, int horarioInicio, int horarioFin, double precioMedioPersona) {
        this.nombre = nombre;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.precioMedioPersona = precioMedioPersona;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", horarioInicio=" + horarioInicio +
                ", horarioFin=" + horarioFin +
                ", precioMedioPersona=" + precioMedioPersona +
                '}';
    }
}
