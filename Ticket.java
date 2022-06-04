package com.company;



import java.util.Date;


public class Ticket {

    private Date fecha;
    private float precio;
    private Cliente clientes;



    public Ticket(Date fecha, float precio, Cliente clientes) {
        this.fecha= fecha;
        this.precio = precio;
        this.clientes = clientes;
    }



    @Override
    public String toString() {
        return "Ticket{" +
                "Fecha:" + fecha +
                ", Precio:" + precio +
                clientes
                +"}";

    }


}

