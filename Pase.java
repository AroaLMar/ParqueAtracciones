package com.company;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

public class Pase {



    private LocalDate fecha;
    private LocalDateTime horainicio;
    private  LocalDateTime horafin;
    private HashSet<Entrada> entradas;

    public void validarPase(LocalDate fecha, LocalDateTime horainicio, LocalDateTime horafin) throws Exception {
        this.fecha = fecha;
        if (fecha == null) throw new ParametrosNoValidos("La fecha no puede ser nula");
        this.horainicio = horainicio;
        if (horainicio == null) throw new ParametrosNoValidos("El horario de inicio no puede ser nulo");
        this.horafin = horafin;
        if (horainicio.isAfter(horafin)) throw new ParametrosNoValidos("La hora de fin no puede ser anterior a la hora de inicio");
    }

    public Pase(LocalDate fecha, LocalDateTime horainicio, LocalDateTime horafin,HashSet entrada) throws Exception {
      validarPase(fecha, horainicio, horafin);
      this.entradas = entrada;
        if (entradas == null) throw new ParametrosNoValidos("Las entradas no pueden ser nulas");
        if (entradas.isEmpty()) throw new ParametrosNoValidos("Al menos una entrada");

    }

    public Pase(LocalDate fecha, LocalDateTime horainicio, LocalDateTime horafin) throws Exception {
        validarPase(fecha, horainicio, horafin);
        this.entradas= new HashSet<Entrada>();

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
