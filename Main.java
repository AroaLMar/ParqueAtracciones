package com.company;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws Exception {


        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(new Cliente("Javier","Crespo"));
        clientes.add(new Cliente("David", "Palomares"));
        clientes.add(new Cliente("Cristina", "Martin"));
        clientes.add(new Cliente("Aroa", "Liquete"));
        clientes.add(new Cliente("Javier", "Diaz"));
        clientes.add(new Cliente("Maria", "Garcia"));
        clientes.add(new Cliente("Fernando", "Ramos"));
        clientes.add(new Cliente("Sandra", "Fernandez"));
        clientes.add(new Cliente("Sergio", "Lopez"));
        clientes.add(new Cliente("Sergio", "Merino"));
        clientes.add(new Cliente("Ines", "Argaya"));
        clientes.add(new Cliente("Prados", "Cabo"));
        clientes.add(new Cliente("Silvia", "Brasero"));
        clientes.add(new Cliente("David", "Gonzalez"));
        clientes.add(new Cliente("Mario", "Romo"));
        clientes.add(new Cliente("Jose", "Amigo"));
        clientes.add(new Cliente("Javier", "Diaz"));
        clientes.add(new Cliente("David", "Perez"));
        clientes.add(new Cliente("Cristina", "Lopez"));
        clientes.add(new Cliente("Clara", "Muñoz"));


        Entrada entr1 = new Entrada(13, 30f, Entrada.Estado.DISPONIBLE);
        entr1.añadirTickets(new Ticket(new Date(2022, 5, 24), 12f, clientes.get(0)));
        entr1.añadirTickets(new Ticket(new Date(2022, 5, 24), 12f, clientes.get(1)));


        Entrada entr2 = new Entrada(17, 30f, Entrada.Estado.VENDIDA);
        entr2.añadirTickets(new Ticket(new Date(2022, 5, 24), 18f, clientes.get(2)));
        entr2.añadirTickets(new Ticket(new Date(2022, 5, 24), 18f, clientes.get(3)));


        Entrada entr3 = new Entrada(25, 30f, Entrada.Estado.DISPONIBLE);
        entr3.añadirTickets(new Ticket(new Date(2022, 5, 25), 14f, clientes.get(4)));
        entr3.añadirTickets(new Ticket(new Date(2022, 5, 25), 12f, clientes.get(5)));


        Entrada entr4 = new Entrada(35, 30f, Entrada.Estado.VENDIDA);
        entr4.añadirTickets(new Ticket(new Date(2022, 5, 25), 14f, clientes.get(6)));
        entr4.añadirTickets(new Ticket(new Date(2022, 5, 25), 12f, clientes.get(7)));


        Entrada entr5 = new Entrada(40, 30f, Entrada.Estado.DISPONIBLE);
        entr5.añadirTickets(new Ticket(new Date(2022, 5, 26), 17f, clientes.get(8)));
        entr5.añadirTickets(new Ticket(new Date(2022, 5, 26), 17f, clientes.get(9)));


        Entrada entr6 = new Entrada(23, 30f, Entrada.Estado.VENDIDA);
        entr6.añadirTickets(new Ticket(new Date(2022, 5, 26), 17f, clientes.get(10)));
        entr6.añadirTickets(new Ticket(new Date(2022, 5, 26), 17f, clientes.get(11)));


        Entrada entr7 = new Entrada(43, 30f, Entrada.Estado.DISPONIBLE);
        entr7.añadirTickets(new Ticket(new Date(2022, 5, 27), 12f, clientes.get(12)));
        entr7.añadirTickets(new Ticket(new Date(2022, 5, 27), 14f, clientes.get(13)));


        Entrada entr8 = new Entrada(21, 30f, Entrada.Estado.VENDIDA);
        entr8.añadirTickets(new Ticket(new Date(2022, 5, 27), 12f, clientes.get(14)));
        entr8.añadirTickets(new Ticket(new Date(2022, 5, 27), 14f, clientes.get(15)));


        Entrada entr9 = new Entrada(32, 30f, Entrada.Estado.DISPONIBLE);
        entr9.añadirTickets(new Ticket(new Date(2022, 5, 28), 17f, clientes.get(16)));
        entr9.añadirTickets(new Ticket(new Date(2022, 5, 28), 17f, clientes.get(17)));


        Entrada entr10 = new Entrada(8, 30f, Entrada.Estado.VENDIDA);
        entr10.añadirTickets(new Ticket(new Date(2022, 5, 28), 17f, clientes.get(18)));
        entr10.añadirTickets(new Ticket(new Date(2022, 5, 28), 17f, clientes.get(19)));


        Pase pase1 = new Pase(new Date(2022, 5, 24), 11, 12);
        pase1.añadirEntradas(entr1);
        pase1.añadirEntradas(entr2);

        Pase pase2 = new Pase(new Date(2022, 5, 24), 14, 17);
        pase2.añadirEntradas(entr3);
        pase2.añadirEntradas(entr4);

        Pase pase3 = new Pase(new Date(2022, 5, 24), 14, 16);
        pase3.añadirEntradas(entr5);
        pase3.añadirEntradas(entr6);

        Pase pase4 = new Pase(new Date(2022, 5, 24), 12, 13);
        pase4.añadirEntradas(entr7);
        pase4.añadirEntradas(entr8);

        Pase pase5 = new Pase(new Date(2022, 5, 24), 14, 15);
        pase5.añadirEntradas(entr9);


        Pase pase6 = new Pase(new Date(2022, 5, 24), 16, 17);
        pase6.añadirEntradas(entr10);


        Espectaculo espec1 = new Espectaculo("La madriguera de Bugd Bunny", "infantil", 30);
        espec1.añadirPases(pase1);
        espec1.añadirPases(pase2);

        Espectaculo espec2 = new Espectaculo("Dance Festival", "musical", 40);
        espec2.añadirPases(pase3);
        espec2.añadirPases(pase4);

        Espectaculo espec3 = new Espectaculo("Batman vs Joker", "ciencia ficcion", 50);
        espec3.añadirPases(pase5);


        Espectaculo espec4 = new Espectaculo("Expediente Warren:Pasaje del Terror", "terror", 40);
        espec4.añadirPases(pase6);


        Atraccion atrac1 = new Atraccion("!A toda Máquina!", 90, 30, 10);
        Atraccion atrac2 = new Atraccion("Convoy de Camiones", 105, 10, 5);
        Atraccion atrac3 = new Atraccion("Acme Juegos del Agua", 0, 20, 10);
        Atraccion atrac4 = new Atraccion("Superman, atraccion de acero", 132, 30, 10);
        Atraccion atrac5 = new Atraccion("Coches de choque", 132, 12, 5);
        Atraccion atrac6 = new Atraccion("La Venganza de Enigma", 105, 20, 10);
        Atraccion atrac7 = new Atraccion("sCataratas Salavaje", 110, 25, 10);
        Atraccion atrac8 = new Atraccion("Los carros de la mina", 120, 35, 5);
        Atraccion atrac9 = new Atraccion("Rio Bravo", 0, 100, 15);


        Restaurante rest1 = new Restaurante("Cartoon Cafe", 12, 23, 5.5);
        Restaurante rest2 = new Restaurante("Ristorante Piolini", 13, 17, 12.5);
        Restaurante rest3 = new Restaurante("Gotham City Grill", 13, 17, 18.5);
        Restaurante rest4 = new Restaurante("The Penguin Helados", 12, 19, 3.5);
        Restaurante rest5 = new Restaurante("El Rancho", 13, 17, 15.00);
        Restaurante rest6 = new Restaurante("La cantina de los bandidos", 12, 20, 7.00);


        ZonaTematica zonTem1 = new ZonaTematica("CARTOON VILLAGE", "PARA TODA LA FAMILIA", "AZUL");
        zonTem1.añadirEspectaculos(espec1);
        zonTem1.añadirEspectaculos(espec2);
        zonTem1.añadirAtracciones(atrac1);
        zonTem1.añadirAtracciones(atrac2);
        zonTem1.añadirAtracciones(atrac3);
        zonTem1.añadirRestaurantes(rest1);
        zonTem1.añadirRestaurantes(rest2);

        ZonaTematica zonTem2 = new ZonaTematica("DC SUPER HEROES WORLD", "PARA LOS MÁS ATREVIDOS", "MORADO");
        zonTem2.añadirEspectaculos(espec3);
        zonTem2.añadirAtracciones(atrac4);
        zonTem2.añadirAtracciones(atrac5);
        zonTem2.añadirAtracciones(atrac6);
        zonTem2.añadirRestaurantes(rest3);
        zonTem2.añadirRestaurantes(rest4);


        ZonaTematica zonTem3 = new ZonaTematica("OLD WEST TERRITORY", "PARA ADOLESCENTES Y NIÑOS", "VERDE");
        zonTem3.añadirEspectaculos(espec4);
        zonTem3.añadirAtracciones(atrac7);
        zonTem3.añadirAtracciones(atrac8);
        zonTem3.añadirAtracciones(atrac9);
        zonTem3.añadirRestaurantes(rest5);
        zonTem3.añadirRestaurantes(rest6);


        Scanner sc = new Scanner(System.in);


        String opcion = "";
        String opcion2 = "";


        System.out.println("Bienvenido al Parque!!");

        while (!opcion2.equals("2")) {
            System.out.println("Identificate");
            System.out.println("[1] -- Administrador(Ver Clientes)");
            System.out.println("[2] -- Visitante");
            System.out.print("Opcion: ");
            opcion2 = sc.nextLine();

            switch (opcion2) {
                case "1":

                            for (Cliente c : clientes) {
                                System.out.println(c);
                            }
                            break;

             case "2":


                            while (!opcion.equals("4")) {

                                System.out.println("Elige la zona temática que quieres visitar");
                                System.out.println("[1] -- Cartoon Village");
                                System.out.println("[2] -- DC Superheroes World");
                                System.out.println("[3] -- Old West Territory");
                                System.out.println("[4] -- Salir");
                                System.out.print("Opcion: ");
                                opcion = sc.nextLine();


                                switch (opcion) {
                                    case "1":
                                        System.out.println(zonTem1);
                                        break;

                                    case "2":
                                        System.out.println(zonTem2);
                                        break;

                                    case "3":
                                        System.out.println(zonTem3);
                                        break;

                                    case "4":
                                        System.out.println("Has salido del programa");
                                        break;

                                    default:
                                        System.out.println("Opcion no válida");
                                }
                                break;
                            }
                default:
                    System.out.println("Opcion no válida");

                    }


            }
        }

}