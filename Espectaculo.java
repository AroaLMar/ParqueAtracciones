package com.company;


import java.util.ArrayList;

    public class Espectaculo {

        private String nombre;
        private String tipoEspectaculo;
        private int minutos;
        private ArrayList <Pase> pases;

        public void validarEspectaculo(String nombre, String tipoEspectaculo, int minutos) throws ParametrosNoValidos {
            this.nombre = nombre;
            if(nombre==null) throw new ParametrosNoValidos("El nombre del espectaculo no puede ser nulo");
            this.tipoEspectaculo = tipoEspectaculo;
            if(tipoEspectaculo==null) throw new ParametrosNoValidos("El tipo de espectaculo no puede ser nulo");
            this.minutos = minutos;
            if(minutos<=0)throw new ParametrosNoValidos("Los minutos no pueden ser menor o igual a 0");

        }

        public Espectaculo(String nombre, String tipoEspectaculo, int minutos, ArrayList <Pase> pases) throws ParametrosNoValidos {
            validarEspectaculo(nombre, tipoEspectaculo, minutos);
            this.pases=pases;
            if(pases==null)throw new ParametrosNoValidos("El pase no puede ser nulo");

        }

        public Espectaculo(String nombre, String tipoEspectaculo, int minutos) throws ParametrosNoValidos {
            validarEspectaculo(nombre, tipoEspectaculo, minutos);
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

