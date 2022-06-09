package com.company;

import java.time.LocalDate;



    public class Ticket {

        private LocalDate fecha;
        private float precio;
        private Cliente clientes;



        public Ticket(LocalDate fecha, float precio, Cliente clientes) throws ParametrosNoValidos {
            this.fecha = fecha;
            if(fecha==null) throw new ParametrosNoValidos("La fecha no puede ser nula");
            this.precio = precio;
            if(precio<=0) throw new ParametrosNoValidos("El precio no puede ser menor o igual a 0");
            this.clientes = clientes;
            if(clientes==null) throw new ParametrosNoValidos("El cliente no puede ser nulo");

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

