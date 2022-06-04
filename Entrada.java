package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Entrada {


    private Integer asiento;
    private float precio;
    private ArrayList <Ticket> tickets;
    private Estado estado;

    public void añadirTickets(Ticket tickets) {


        this.tickets.add(tickets);




    }


    public enum Estado {
        DISPONIBLE, VENDIDA;
    }

    public Entrada(Integer asiento, float precio, Estado estado) {
        this.asiento = asiento;
        this.precio = precio;
        this.estado = estado;
        this.tickets=new ArrayList<Ticket>();
    }







    public Entrada(Integer asiento, float precio, Estado estado,ArrayList<Ticket> tickets) {
        this.asiento = asiento;
        this.precio = precio;
        this.estado = estado;
        this.tickets=tickets;
    }



    @Override
    public String toString() {
        return "Entrada{" +
                "Asiento=" + asiento +
                ", Precio=" + precio +
                ", Estado=" + estado +
                "," +tickets+
                "}";

    }




}
