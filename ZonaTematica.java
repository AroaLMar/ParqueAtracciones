package com.company;


import java.util.ArrayList;

public class ZonaTematica {

    private String nombre;
    private String descripcion;
    private String color;
    private ArrayList<Atraccion> atracciones;
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<Espectaculo> espectaculos;

    public void validarZonatematica(String nombre, String descripcion, String color) throws ParametrosNoValidos {
        this.nombre = nombre;
        if (nombre == null) throw new ParametrosNoValidos("El nombre no puede ser nulo");
        this.descripcion = descripcion;
        if (descripcion == null) throw new ParametrosNoValidos("La descripcion no puede ser nula");
        this.color = color;
        if (color == null) throw new ParametrosNoValidos("El color no puede ser nulo");
    }

    public ZonaTematica(String nombre, String descripcion, String color) throws ParametrosNoValidos {
        validarZonatematica(nombre, descripcion, color);
        this.espectaculos=new ArrayList<Espectaculo>();
        this.restaurantes=new ArrayList<Restaurante>();
        this.atracciones=new ArrayList<Atraccion>();

    }



    public ZonaTematica(String nombre, String descripcion, String color, ArrayList <Atraccion> atracciones,  ArrayList<Restaurante> restaurantes,  ArrayList<Espectaculo> espectaculos) throws ParametrosNoValidos {
        validarZonatematica(nombre, descripcion, color);
        this.atracciones = atracciones;
        if (atracciones == null) throw new ParametrosNoValidos("La atraccion no puede ser nula");
        if (atracciones.isEmpty()) throw new ParametrosNoValidos("Al menos una atraccion");
        this.restaurantes = restaurantes;
        if (restaurantes == null) throw new ParametrosNoValidos("El restaurante no puede ser nulo");
        if (restaurantes.isEmpty()) throw new ParametrosNoValidos("Al menos un restaurante");
        this.espectaculos = espectaculos;
        if (espectaculos == null) throw new ParametrosNoValidos("El espectaculo no puede ser nulo");
        if (espectaculos.isEmpty()) throw new ParametrosNoValidos("Al menos un espectaculo");



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
