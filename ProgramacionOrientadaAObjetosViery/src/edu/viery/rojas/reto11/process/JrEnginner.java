package edu.viery.rojas.reto11.process;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    public class JrEnginner extends Empleado{

        public String RFC;

        public JrEnginner(String nombre, int edad, String s) {
            super(edad, nombre, 0);
            this.RFC = generarRFC();
        }

        public String getRFC() {
            return RFC;
        }

        public void setRFC(String RFC) {
            this.RFC = RFC;
        }

        private String generarRFC() {
            String[] letrasRFC = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                sb.append(letrasRFC[(int) (Math.random() * letrasRFC.length)]);
            }
            sb.append(getEdad());
            sb.append((int) (Math.random() * 10));
            sb.append((int) (Math.random() * 10));
            sb.append((int) (Math.random() * 10));
            return sb.toString();
        }

        public static void main(String[] args) {
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

            // Imprimir la lista de JrEnginner
            for (JrEnginner jrEnginner : listaJrEnginner) {
                System.out.println(jrEnginner.getNombre() + ", " + jrEnginner.getEdad() + " años, RFC: " + jrEnginner.getRFC());
 }
}
    }
