package edu.viery.rojas.reto6.ui;
import static edu.viery.rojas.reto6.process.JuegoNiveles.ObtenerPalabra;
import edu.viery.rojas.reto6.process.JuegoNiveles;

import java.util.Random;
import java.util.Scanner;


/**
 * en este apartado esta el menu de interfaz el cual esta creado para que solo te arroje los resultados con los que el usuario va a interactuar con dicho programa
 */
public class CLI {
    public static void MuestraElMenu() {
        String entrada = "";
        try (Scanner teclado = new Scanner(System.in)) {
            while (!entrada.equals("0")) {
                System.out.println("\nElija nivel dificultad...");
                System.out.println("(1) --> Fácil");
                System.out.println("(2) --> Intermedio");
                System.out.println("(3) --> Avanzado");
                System.out.println("(0) --> SALIR");
                System.out.print("Su opción [0-3]: ");
                entrada = teclado.nextLine();

                if (!entrada.equals("0")) {
                    //Pedimos una palabra en base al nivel de dificultad
                    String palabra = ObtenerPalabra(entrada);

                    if (palabra == null) //Si hemos recibido null, es porque la opcion no es válida
                        System.out.println("Escoja una opción válida.");
                    else {
                        String letra = "";
                        System.out.print("\nPruebe una letra [0 = SALIR]: ");
                        letra = teclado.nextLine().toLowerCase();
                        {
                            while (!letra.equals("0")) {
                                if (palabra.contains(letra)) {
                                    //Mostramos palabra pero solo enseñando la letra coincidente
                                    System.out.println("\nEsa letra SI existe en la palabra:");
                                    for (int i = 0; i < palabra.length(); i++) {
                                        if (palabra.charAt(i) == letra.charAt(0)) //Es la letra coincidente
                                            System.out.print(palabra.charAt(i));
                                        else //No es la letra, tapamos con asterisco
                                            System.out.print('*');
                                    }
                                } else
                                    System.out.println("Esa letra NO existe en la palabra");

                                System.out.print("\nPruebe otra letra [0 = SALIR]: ");
                                letra = teclado.nextLine();
                                if (!entrada.equals("0"))
                                    break;
                                else
                                    System.out.print("\nPruebe otra letra [0 = SALIR]: ");

                            }
                        }
                    }
                }
                System.out.println("\n\nFIN DEL PROGRAMA");
            }
        } catch (Exception e) { //Usamos una excepción de esta manera y con esto evita que la aplicación se detenga o de
            //error
            System.out.println("se debe de poner un numero y no una letra");
        }
    }
}