package com.company;

import java.util.ArrayList;

public class Espectaculo {

    private String nombre;
    private String tipoEspectaculo;
    private Integer minutos;
    private ArrayList <Pase> pases;

    public Espectaculo(String nombre, String tipoEspectaculo, Integer minutos, ArrayList <Pase> pases) {
        this.nombre = nombre;
        this.tipoEspectaculo = tipoEspectaculo;
        this.minutos = minutos;
        this.pases=pases;
    }

    public Espectaculo(String nombre, String tipoEspectaculo, Integer minutos) {
        this.nombre = nombre;
        this.tipoEspectaculo = tipoEspectaculo;
        this.minutos = minutos;
        this.pases=new ArrayList<Pase>();

    }

    @Override
    public String toString() {
        return "Espectaculo{" +
                "nombre='" + nombre + '\'' +
                ", tipoEspectaculo='" + tipoEspectaculo + '\'' +
                ", minutos=" + minutos +
                pases+
                '}';
    }

    public void añadirPases(Pase pases){

        this.pases.add(pases);
    }




}
