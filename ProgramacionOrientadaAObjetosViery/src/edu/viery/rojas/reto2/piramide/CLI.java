package edu.viery.rojas.reto2.piramide;

import java.util.Scanner;
/**
 EXPLICACION DEL CODIGO
 -----------------------------------------------------------------------------------------------------
 import java.util.Scanner;
 Esto nos permite leer datos de entrada del usuario a través del teclado.
 -----------------------------------------------------------------------------------------------------
 Definimos la clase "asterisco" con la palabra clave public.
 La clase es el contenedor principal para el código y los datos que describen un objeto.
 -----------------------------------------------------------------------------------------------------
 public static void main(String[] args) {
 } El método main es el punto de entrada para la aplicación. Aquí es donde comienza la ejecución del programa.
 -----------------------------------------------------------------------------------------------------
 Scanner scan = new Scanner(System.in);
 Creamos un objeto de Scanner para leer la entrada del usuario.
 -----------------------------------------------------------------------------------------------------
 Pedir la altura del triángulo al usuario:
 System.out.println("Ingrese la altura del triángulo:");
 int height = scan.nextInt();
 Imprimimos un mensaje para solicitar la altura del triángulo y luego leemos la entrada con el método nextInt del objeto Scanner.
 -----------------------------------------------------------------------------------------------------
 Ciclo for para imprimir cada fila del triángulo:
 for (int row = 1; row <= height; row++) {
 }
 Este ciclo for se ejecuta height veces para imprimir cada fila del triángulo.
 -----------------------------------------------------------------------------------------------------
 Ciclo for para imprimir los espacios:
 for (int space = height - row; space > 0; space--) {
 System.out.print(" ");
 }
 Este ciclo for se ejecuta un número de veces igual a height - row para imprimir los espacios necesarios en cada fila.
 -----------------------------------------------------------------------------------------------------
 Ciclo for para imprimir los asteriscos:
 for (int star = 1; star <= 2 * row - 1; star++) {
 System.out.print("*");
 }
 Este ciclo for se ejecuta un número de veces igual a 2 * row - 1 para imprimir los asteriscos en cada fila.
 -----------------------------------------------------------------------------------------------------
 Saltar a la siguiente línea:
 System.out.println();
 Este comando salta a la siguiente línea para imprimir la siguiente fila del triángulo.
 -----------------------------------------------------------------------------------------------------
 Este printf es para saber la cantidad de pisos introducida anteriormente del triangulo:
 System.out.printf("la cantidad de pisos del triangulo es %d",height);
 Eso es todoooo :)
 */

public class CLI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la altura del triángulo:");
        int height = scan.nextInt();

        for (int row = 1; row <= height; row++) {
            for (int space = height - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.printf("la cantidad de pisos del triangulo es %d",height);
    }
}