package edu.viery.rojas.reto11.process;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArchivoTexto {
    // Método para guardar la lista de JrEngineer en un archivo de texto
    public static void guardarLista(List<JrEnginner> lista, String nombreArchivo) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));
            for (JrEnginner jrEngineer : lista) {
                // Formato de línea en el archivo: Nombre, Edad, Salario, Lenguaje de programación, RFC
                String linea = jrEngineer.nombre + "," + jrEngineer.edad +  "," + jrEngineer.RFC;
                escritor.write(linea);
                escritor.newLine();
            }
            escritor.close();
            System.out.println("Lista de JrEngineer guardada en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar la lista de JrEngineer en el archivo: " + nombreArchivo);
            e.printStackTrace();
        }
    }


}