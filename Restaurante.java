package com.company;


import java.time.LocalDateTime;

public class Restaurante {

        private String nombre;
        private LocalDateTime horarioInicio;
        private LocalDateTime horarioFin;
        private double precioMedioPersona;


        public Restaurante(String nombre, LocalDateTime horarioInicio, LocalDateTime horarioFin, double precioMedioPersona) throws ParametrosNoValidos {
            this.nombre = nombre;
            if (nombre == null) throw new ParametrosNoValidos("El nombre no puede ser nulo");
            this.horarioInicio = horarioInicio;
            if (horarioInicio == null) throw new ParametrosNoValidos("El nombre no puede ser nulo");
            this.horarioFin = horarioFin;
            if (horarioFin == null) throw new ParametrosNoValidos("El nombre no puede ser nulo");
            if (horarioInicio.isAfter(horarioFin))
                throw new ParametrosNoValidos("La hora de fin no puede ser anterior a la hora de inicio");
            this.precioMedioPersona = precioMedioPersona;
            if (precioMedioPersona <= 0)
                throw new ParametrosNoValidos("El precio medio por persona no puede ser menor o igual a 0");
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
