package edu.viery.rojas.reto11.process;

import java.io.*;
import java.util.*;
public class JrEnginner extends Empleado {

    public String RFC;

    public JrEnginner(String nombre, int edad, String rfc) {
        super(edad, nombre, 0);
        this.RFC = rfc;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public static List<JrEnginner> crearListaJrEnginnerAleatoria() {
        String[] nombres = {"Daniel", "Montezuma", "Santiago", "Chino", "Marisol", "Juanita", "Pepito", "Kimberly", "Tilin", "Pepe"};
        int[] edades = {18, 21, 24, 25, 18, 28, 19, 18, 22, 19};

        List<JrEnginner> listaJrEnginner = new ArrayList<>();
        Set<String> nombresUtilizados = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            String nombre;
            do {
                nombre = nombres[(int) (Math.random() * nombres.length)];
            } while (nombresUtilizados.contains(nombre));
            nombresUtilizados.add(nombre);

            int edad = edades[(int) (Math.random() * edades.length)];

            String rfc = generarRFC();

            JrEnginner jrEnginner = new JrEnginner(nombre, edad, rfc);
            listaJrEnginner.add(jrEnginner);
        }
        System.out.println("Lista creada");
        return listaJrEnginner;
    }

    private static String generarRFC() {
        String[] letrasRFC = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(letrasRFC[(int) (Math.random() * letrasRFC.length)]);
        }
        sb.append((int) (Math.random() * 100));
        return sb.toString();
    }
    public static void imprimirListaJrEnginner(List<JrEnginner> listaJrEnginner) {
        for (JrEnginner jrEnginner : listaJrEnginner) {
            System.out.println(jrEnginner.getNombre() + ", " + jrEnginner.getEdad() + " años, RFC: " + jrEnginner.getRFC());
        }
    }
    public static void guardarArchivoJrEnginner(String lista_jrenginner, List<JrEnginner> listaJrEnginner) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Christian\\Downloads\\lista_jrenginner.txt");
            for (JrEnginner jrEnginner : listaJrEnginner) {
                String linea = jrEnginner.getNombre() + "," + jrEnginner.getEdad() + "," + jrEnginner.getRFC() + "\n";
                fileWriter.write(linea);
            }
            fileWriter.close();
            System.out.println("Archivo creado y actualizado.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
    public static List<JrEnginner> leerArchivoJrEnginner(String nombreArchivo) {
        List<JrEnginner> listaJrEnginner = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String rfc = datos[2];
                JrEnginner jrEnginner = new JrEnginner(nombre, edad, rfc);
                listaJrEnginner.add(jrEnginner);
            }
            br.close();
            System.out.println("Archivo leído correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        return listaJrEnginner;
    }

    public static void imprimirarchivoJrEnginner(String lista) {
        List<JrEnginner> listaJrEnginner = leerArchivoJrEnginner("C:\\Users\\Christian\\Downloads\\lista_jrenginner.txt");
        for (JrEnginner jrEnginner : listaJrEnginner) {
            System.out.println(jrEnginner.getNombre() + ", " + jrEnginner.getEdad() + ", " + jrEnginner.getRFC());
        }
    }
    public static List<JrEnginner> filtrarJrEnginnerMayoresDe20(String lista_jrenginner) {
        List<JrEnginner> listaJrEnginner = leerArchivoJrEnginner("C:\\Users\\Christian\\Downloads\\lista_jrenginner.txt");
        List<JrEnginner> listaJrEnginnerMayoresDe20 = new ArrayList<>();

        for (JrEnginner jrEnginner : listaJrEnginner) {
            if (jrEnginner.getEdad() > 20) {
                listaJrEnginnerMayoresDe20.add(jrEnginner);
            }
        }

        return listaJrEnginnerMayoresDe20;
    }


    public static void imprimirJrEnginnerMayoresDe20(String lista_jrenginner) {
        List<JrEnginner> listaFiltrada = filtrarJrEnginnerMayoresDe20("C:\\Users\\Christian\\Downloads\\lista_jrenginner.txt");
        if (listaFiltrada.isEmpty()) {
            System.out.println("No se encontraron JrEnginner mayores de 20 años.");
        } else {
            System.out.println("JrEnginner mayores de 20 años:");
            for (JrEnginner jrEnginner : listaFiltrada) {
                System.out.println("Nombre: " + jrEnginner.getNombre() + ", Edad: " + jrEnginner.getEdad());
            }
   }
}


}