package edu.viery.rojas.reto11;
import java.util.*;


import edu.viery.rojas.reto11.process.ArchivoTexto;
import edu.viery.rojas.reto11.process.JrEnginner;
import edu.viery.rojas.reto11.ui.CLI;

public class Main {
            public static void main(String[] args) {{
                CLI.main();
            }
                {



                    String[] nombres = {"Daniel", "Montezuma", "Santiago", "Chino", "Marisol", "Juanita", "Pepito", "Kimberly", "Tilin", "Pepe"};
                    int[] edades = {18, 21, 24, 25, 18, 28, 19, 18, 22, 19};

                    Set<String> nombresUtilizados = new HashSet<>();
                    List<JrEnginner> listaJrEnginner = new ArrayList<>();


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

