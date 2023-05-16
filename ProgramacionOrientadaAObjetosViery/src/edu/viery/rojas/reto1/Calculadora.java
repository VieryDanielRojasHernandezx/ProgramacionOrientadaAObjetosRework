package edu.viery.rojas.reto1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la opción de operación que desea realizar:");
        System.out.println("a) Suma");
        System.out.println("b) Resta");
        System.out.println("c) Multiplicación");
        System.out.println("d) División");

        char opcion = scanner.nextLine().charAt(0);

        System.out.println("Ingrese el primer número:");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese el segundo número:");
        double num2 = Double.parseDouble(scanner.nextLine());

        double resultado = 0;

        switch (opcion) {
            case 'a':
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case 'b':
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case 'c':
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case 'd':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}

