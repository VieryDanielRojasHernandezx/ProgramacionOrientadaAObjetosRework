package edu.viery.rojas.reto12.ui;

import edu.viery.rojas.reto12.process.JrEnginner;

import java.util.List;
import java.util.Scanner;

import static edu.viery.rojas.reto12.process.JrEnginner.crearListaJrEnginnerAleatoria;
import static edu.viery.rojas.reto12.process.JrEnginner.imprimirListaJrEnginner;

public class CLI {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        List<JrEnginner> listaJrEnginner = crearListaJrEnginnerAleatoria();
        boolean salir = false;

        while (!salir) {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Crear lista de JrEnginner");
            System.out.println("2. Imprimir lista");
            System.out.println("3. Guardar lista en un archivo");
            System.out.println("4. leer el archivo");
            System.out.println("5. Imprimir archivo leido");
            System.out.println("6. Filtro para mayor de 18 y menor de 25 años");
            System.out.println("7. Ordenamiento por Alfabeto");
            System.out.println("8. Promedio de EDAD");
            System.out.println("0. Salir");
            System.out.print("Ingresa tu opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearListaJrEnginnerAleatoria();
                    break;
                case 2:
                    imprimirListaJrEnginner(listaJrEnginner);
                    break;
                case 3:
                    JrEnginner.guardarArchivoJrEnginner("listJrEnginner.txt", listaJrEnginner);
                    break;
                case 4:
                    JrEnginner.leerArchivoJrEnginner("C:\\Users\\Christian\\Downloads\\lista_jrenginner.txt");
                    break;
                case 5:
                    JrEnginner.imprimirarchivoJrEnginner("C:\\Users\\Christian\\Downloads\\lista_jrenginner.txt");
                    break;
                case 6:
                    List<JrEnginner> listaFiltrada = JrEnginner.filtrarJrEnginnerMayoresDe18ymenoresde25("C:\\Users\\Christian\\Downloads\\lista_jrenginner.txt");
                    JrEnginner.imprimirJrEnginnerMayoresDe20(listaFiltrada.toString());
                    break;
                case 7:
                    //Ordenamos la lista de JrEnginner por nombres en orden alfabético
                    JrEnginner.ordenarListaJrEnginnerPorNombres(listaJrEnginner);
                    System.out.println("Lista de JrEnginner ordenada alfabéticamente por nombres:");
                    imprimirListaJrEnginner(listaJrEnginner);
                    break;
                case 8:
                    // Calculamos el promedio de edades de la lista
                    double promedioEdades = JrEnginner.calcularPromedioEdades(listaJrEnginner);
                    System.out.printf("El promedio de edades de los JrEngineers es: %.2f\n", promedioEdades);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}