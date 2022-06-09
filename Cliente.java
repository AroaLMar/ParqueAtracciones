package com.company;

    public class Cliente {

        private String nombre;
        private String apellidos;



        public Cliente(String nombre, String apellidos) throws Exception {
            this.nombre = nombre;
            if(nombre==null)throw new Exception("El nombre del cliente no puede ser nulo");
            this.apellidos = apellidos;
            if(apellidos==null)throw new Exception("Es obligatorio que los clientes tengan apellidos registrados");

        }



        @Override
        public String toString() {
            return "Cliente{" +
                    "nombre='" + nombre + '\'' +
                    ", apellidos='" + apellidos + '\'' +
                    '}';
        }



    }

