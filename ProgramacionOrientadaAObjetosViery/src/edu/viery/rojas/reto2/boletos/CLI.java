package edu.viery.rojas.reto2.boletos;

import java.util.Scanner;

public class CLI {
    public static void showMenu() {

        salida:
        do {
            System.out.println("elige un boleto a comprar");
            System.out.println("a) Niño: $70");
            System.out.printf(" b) adulto: $100");
            System.out.println("s) salir");

            String tipoBoleto = "";
            Scanner scanner = new Scanner(System.in);
            tipoBoleto = scanner.nextLine();
            if (tipoBoleto.equals("s")) {
                break salida;
            }
            int child = 0;
            switch (tipoBoleto) {
                case "a":
                    child++;
                    break;
            }
            int adult = 0;
            switch (tipoBoleto) {
                case "b":
                    adult++;
                    break;
            }
            switch (tipoBoleto) {
                case "s":
                    break;


            }
            while (true) ;
        }
        while (true) ;
    }
}