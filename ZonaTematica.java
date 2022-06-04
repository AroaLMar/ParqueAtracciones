package com.company;


import java.util.ArrayList;

public class ZonaTematica {

    private String nombre;
    private String descripcion;
    private String color;
    private ArrayList<Atraccion> atracciones;
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<Espectaculo> espectaculos;

    public ZonaTematica(String nombre, String descripcion, String color) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.espectaculos=new ArrayList<Espectaculo>();
        this.restaurantes=new ArrayList<Restaurante>();
        this.atracciones=new ArrayList<Atraccion>();
    }


    @Override
    public String toString() {
        return "Zona_Tematica{" +
                "NOMBRE=" +nombre+", "+
                "Descripcion=" + descripcion+", "+
                "Color=" + color+ "}"+
                "\n -" + atracciones+
                "\n -" + restaurantes+
                "\n -" + espectaculos;
    }



    public ZonaTematica(String nombre, String descripcion, String color, ArrayList <Atraccion> atracciones,  ArrayList<Restaurante> restaurantes,  ArrayList<Espectaculo> espectaculos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.atracciones = atracciones;
        this.restaurantes = restaurantes;
        this.espectaculos = espectaculos;
    }

    public void añadirRestaurantes(Restaurante restaurantes){

        this.restaurantes.add(restaurantes);
    }

    public void añadirAtracciones(Atraccion atracciones){

        this.atracciones.add(atracciones);
    }

    public void añadirEspectaculos(Espectaculo espectaculos){

        this.espectaculos.add(espectaculos);
    }
}
