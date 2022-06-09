package com.company;


public class Entrada {


    private int asiento;
    private float precio;
    private String estado;
    private Ticket tickets;


    public void validarEntrada(int asiento, float precio, String estado) throws ParametrosNoValidos {
        this.asiento = asiento;
        if(asiento<=0)throw new ParametrosNoValidos("El asiento no puede ser menor o igual a 0");
        this.precio = precio;
        if(precio<=0)throw new ParametrosNoValidos("El precio no puede ser menor o igual a 0");
        this.estado = estado;
        if(estado==null)throw new ParametrosNoValidos("El estado de la entrada no puede ser nulo");
        if(!estado.equals("vendida")&&(!estado.equals("disponible")))throw new ParametrosNoValidos("El estado de la entrada no es valido");
    }

    public Entrada(int asiento, float precio, String estado) throws ParametrosNoValidos {
       validarEntrada(asiento, precio, estado);
        this.tickets= tickets;
    }



    public Entrada(int asiento, float precio, String estado,Ticket tickets) throws ParametrosNoValidos {
        validarEntrada(asiento, precio, estado);
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
