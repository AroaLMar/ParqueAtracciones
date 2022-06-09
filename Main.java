package com.company;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws Exception {



        Cliente cli=new Cliente("Javier","Crespo");
        Cliente cli2=new Cliente("David", "Palomares");
        Cliente cli3=new Cliente("Cristina", "Martin");
        Cliente cli4=new Cliente("Aroa", "Liquete");
        Cliente cli5=new Cliente("Javier", "Diaz");
        Cliente cli6=new Cliente("Maria", "Garcia");
        Cliente cli7=new Cliente("Fernando", "Ramos");
        Cliente cli8=new Cliente("Sandra", "Fernandez");
        Cliente cli9=new Cliente("Sergio", "Lopez");
        Cliente cli10=new Cliente("Sergio", "Merino");


        Entrada entr1 = new Entrada(13, 30f, "disponible",new Ticket(LocalDate.of(2022, 5, 24), 12f, cli));


        Entrada entr2 = new Entrada(17, 30f, "vendida",new Ticket(LocalDate.of(2022, 5, 24), 18f, cli2));



        Entrada entr3 = new Entrada(25, 30f, "disponible",new Ticket(LocalDate.of(2022, 5, 25), 14f, cli3));



        Entrada entr4 = new Entrada(35, 30f, "vendida",new Ticket(LocalDate.of(2022, 5, 25), 14f, cli4));



        Entrada entr5 = new Entrada(40, 30f, "disponible",new Ticket(LocalDate.of(2022, 5, 26), 17f, cli5));



        Entrada entr6 = new Entrada(23, 30f, "vendida",new Ticket(LocalDate.of(2022, 5, 26), 17f, cli6));



        Entrada entr7 = new Entrada(43, 30f,"disponible",new Ticket(LocalDate.of(2022, 5, 27), 12f, cli7));



        Entrada entr8 = new Entrada(21, 30f, "vendida",new Ticket(LocalDate.of(2022, 5, 27), 12f, cli8));



        Entrada entr9 = new Entrada(32, 30f, "disponible",new Ticket(LocalDate.of(2022, 5, 28), 17f, cli9));



        Entrada entr10 = new Entrada(8, 30f, "vendida",new Ticket(LocalDate.of(2022, 5, 28), 17f,cli10));



        Pase pase1 = new Pase(LocalDate.of(2022, 5, 24), LocalDateTime.of(2022,5,24,11,00),LocalDateTime.of(2022,5,24,12,00));
        pase1.añadirEntradas(entr1);
        pase1.añadirEntradas(entr2);

        Pase pase2 = new Pase(LocalDate.of(2022, 5, 24), LocalDateTime.of(2022,5,24,14,00), LocalDateTime.of(2022,5,24,15,00));
        pase2.añadirEntradas(entr3);
        pase2.añadirEntradas(entr4);

        Pase pase3 = new Pase(LocalDate.of(2022, 5, 24), LocalDateTime.of(2022,5,24,15,00), LocalDateTime.of(2022,5,24,16,00));

        pase3.añadirEntradas(entr5);
        pase3.añadirEntradas(entr6);

        Pase pase4 = new Pase(LocalDate.of(2022, 5, 24), LocalDateTime.of(2022,5,24,16,00), LocalDateTime.of(2022,5,24,17,00));

        pase4.añadirEntradas(entr7);
        pase4.añadirEntradas(entr8);

        Pase pase5 = new Pase(LocalDate.of(2022, 5, 24), LocalDateTime.of(2022,5,24,17,00), LocalDateTime.of(2022,5,24,18,00));

        pase5.añadirEntradas(entr9);


        Pase pase6 = new Pase(LocalDate.of(2022, 5, 24), LocalDateTime.of(2022,5,24,18,00), LocalDateTime.of(2022,5,24,19,00));

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
        Atraccion atrac3 = new Atraccion("Acme Juegos del Agua", 95, 20, 10);
        Atraccion atrac4 = new Atraccion("Superman, atraccion de acero", 132, 30, 10);
        Atraccion atrac5 = new Atraccion("Coches de choque", 132, 12, 5);
        Atraccion atrac6 = new Atraccion("La Venganza de Enigma", 105, 20, 10);
        Atraccion atrac7 = new Atraccion("sCataratas Salavaje", 110, 25, 10);
        Atraccion atrac8 = new Atraccion("Los carros de la mina", 120, 35, 5);
        Atraccion atrac9 = new Atraccion("Rio Bravo", 115, 50, 15);


        Restaurante rest1 = new Restaurante("Cartoon Cafe", LocalDateTime.of(2022,5,24,12,00), LocalDateTime.of(2022,5,24,23,00), 5.5);
        Restaurante rest2 = new Restaurante("Ristorante Piolini", LocalDateTime.of(2022,5,24,13,00), LocalDateTime.of(2022,5,24,17,00),12.5);
        Restaurante rest3 = new Restaurante("Gotham City Grill", LocalDateTime.of(2022,5,24,13,00), LocalDateTime.of(2022,5,24,17,00), 18.5);
        Restaurante rest4 = new Restaurante("The Penguin Helados", LocalDateTime.of(2022,5,24,12,00), LocalDateTime.of(2022,5,24,19,00), 3.5);
        Restaurante rest5 = new Restaurante("El Rancho", LocalDateTime.of(2022,5,24,13,00), LocalDateTime.of(2022,5,24,17,00),15.00);
        Restaurante rest6 = new Restaurante("La cantina de los bandidos", LocalDateTime.of(2022,5,24,12,00), LocalDateTime.of(2022,5,24,20,00), 7.00);


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


        System.out.println("Bienvenido al Parque!!");

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


        }
    }

}
