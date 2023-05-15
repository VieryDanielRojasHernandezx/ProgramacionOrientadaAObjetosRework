package edu.viery.rojas.retofinal.process;

import java.util.Scanner;

public class EntradaSalida {

    private static final Scanner scanner = new Scanner(System.in);

    public static int leerDireccion() {
        System.out.print("Ingresa una dirección (0=izquierda, 1=arriba, 2=derecha, 3=abajo): ");
        int direccion = scanner.nextInt();
        while (direccion < 0 || direccion > 3) {
            System.out.print("Dirección inválida. Ingresa una dirección válida (0=izquierda, 1=arriba, 2=derecha, 3=abajo): ");
            direccion = scanner.nextInt();
        }
        return direccion;
    }

    public static boolean leerRespuesta(String mensaje) {
        System.out.print(mensaje + " ");
        String respuesta = scanner.next().toLowerCase();
        while (!respuesta.equals("si") && !respuesta.equals("no")) {
            System.out.print("Respuesta inválida. " + mensaje + " ");
            respuesta = scanner.next().toLowerCase();
        }
        return respuesta.equals("si");
    }
}

