package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Pase {



    private Date fecha;
    private int horainicio;
    private int horafin;
    private ArrayList<Entrada> entradas;

    public Pase(Date fecha, int horainicio, int horafin,ArrayList entrada) throws Exception {
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horafin = horafin;
        if(horafin<horainicio)throw new Exception("La hora de fin no puede ser menor a la hora de inicio");
        this.entradas = entrada;
    }

    public Pase(Date fecha, int horainicio, int horafin) throws Exception {
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horafin = horafin;
        if(horafin<horainicio)throw new Exception("La hora de fin no puede ser menor a la hora de inicio");
        this.entradas=new ArrayList<Entrada>();
    }


    @Override
    public String toString() {
        return "Pase{" +
                "Fecha:" + fecha +
                ", Horainicio=" + horainicio +
                ", Horafin=" + horafin +
                entradas+
                "}";

    }

    public void añadirEntradas(Entrada entradas){

        this.entradas.add(entradas);
    }



}
