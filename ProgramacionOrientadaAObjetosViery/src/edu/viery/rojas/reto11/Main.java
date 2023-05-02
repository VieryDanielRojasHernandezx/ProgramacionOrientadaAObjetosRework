package edu.viery.rojas.reto11;
import java.util.*;

import edu.viery.rojas.reto11.process.ArchivoTexto;
import edu.viery.rojas.reto11.process.JrEnginner;

public class Main {
            public static void main(String[] args) {
                {
                    String[] nombres = {"Daniel", "Montezuma", "Santiago", "Chino", "Marisol", "Juanita", "Pepito", "Kimberly", "Tilin", "Pepe"};
                    int[] edades = {29, 30, 29, 25, 22, 32, 26, 21, 31, 29};

                    List<JrEnginner> listaJrEnginner = new ArrayList<>();
                    Set<String> nombresUtilizados = new HashSet<>();

                    for (int i = 0; i < 10; i++) {
                        String nombre;
                        do {
                            nombre = nombres[(int) (Math.random() * nombres.length)];
                        } while (nombresUtilizados.contains(nombre));
                        nombresUtilizados.add(nombre);

                        int edad = edades[(int) (Math.random() * edades.length)];

                        JrEnginner jrEnginner = new JrEnginner(nombre, edad, "");
                        listaJrEnginner.add(jrEnginner);

                    }
                    ArchivoTexto.guardarLista(listaJrEnginner, "empleados.txt");


                    // Imprimir la lista de JrEnginner
                    for (JrEnginner jrEnginner : listaJrEnginner) {
                        System.out.println(jrEnginner.getNombre() + ", " + jrEnginner.getEdad() + " años, RFC: " + jrEnginner.getRFC());
                    }
                }

            }
        }

