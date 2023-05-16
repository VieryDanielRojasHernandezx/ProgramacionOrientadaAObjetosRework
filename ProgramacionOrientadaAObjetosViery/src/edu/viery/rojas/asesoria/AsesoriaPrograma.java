package edu.viery.rojas.asesoria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AsesoriaPrograma {

    public static void main(String[] args) {
        //introducimos el nombre del archivos en variable string para su lectura
        String nombreArchivo = "instrucciones.txt";

        try {
            //utilizamos Filereader para la lectura del "instrucciones.txt" del metodo "nombreArchivo"
            FileReader fileReader = new FileReader(nombreArchivo);
            //utilizamos BufferedReader para leer texto del archivo texto linea por linea de manera eficiente.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //asignamos linea tipo string para la lectura
            String linea;

            // Lee una línea del archivo y la asigna a la variable 'linea'
            while ((linea = bufferedReader.readLine()) != null) {
                // Verificamos si la línea no está en blanco con ,isEmpty
                if (!linea.trim().isEmpty()) {
                    procesarInstruccion(linea);
                }
            }
            //Cerramos nuestra lectura
            bufferedReader.close();
        // catch captura la excepción y la asigna a la variable e, que es de tipo IOException.
            // e.getMessage()) nos proporciona información adicional sobre el error que ocurrió.
            //por ej no me encontraba el archivo y me decia que no encontraba la ruta de este mismo
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void procesarInstruccion(String instruccion) {
        char comando = instruccion.charAt(0);
        // Obtiene el primer carácter de la instrucción que seria la letra incial de nuestro archivo texto
        // que representa el comando
        String argumento = instruccion.substring(2);
        // Obtiene el argumento de la instrucción, Osea lo que puse adentro del las letras


        // utilizamos los metodos switch cases para imprimir los metodos y ademas donde inicializa la letra es la informacion
        //que se mostrara
        // Y tambien para determinar el comando y ejecutar la acción correspondiente
        switch (comando) {
            case 'C':
                // Si el comando es 'C' sera el cuadrado
                // Convierte el argumento a un entero que representa la dimensión del cuadrado
                int dimensionCuadrado = Integer.parseInt(argumento);
                // Llama al método 'imprimirCuadrado' pasando la dimensión como argumento
                imprimirCuadrado(dimensionCuadrado);
                break;
            case 'T':
                int alturaTriangulo = Integer.parseInt(argumento);
                imprimirTriangulo(alturaTriangulo);
                break;
            case 'P':
                //aqui no necesitamos convertir nada por lo que nadamas procesamos y imprimimos

                imprimirPalindromo(argumento);
                break;
            case 'S':
                //igual aqui
                imprimirFormatoEspecial(argumento);
                break;
            default:
                // Si el comando no coincide con ninguno de los casos anteriores
                // nos muestra un mensaje indicando que el comando es desconocido
                System.out.println("Comando desconocido: " + comando);
        }
    }

    public static void imprimirCuadrado(int dimension) {
        //con los 2 metodos for leeremos el numero introducido y creara la altura y la longitud del cuadrado por ej.
        //5x5
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                //utilizamos el print "*" justamente para que el numero se imprima en asteriscos
                System.out.print("*");
            }
            //utilizamos el println para el salto de linea de cada linea imprimida
            System.out.println();
        }
    }

    public static void imprimirTriangulo(int altura) {
        //leemos la altura del triangulo introducida
        for (int i = 0; i < altura; i++) {
            //leemos la longitud de la linea de asteriscos introducida
            for (int j = 0; j <= i; j++) {
                //lo imprimimos con asterisco
                System.out.print("*");
            }
            // Imprimo un salto de línea para pasar a la siguiente fila del triángulo para que no se vea amontonado
            System.out.println();
        }
    }

    public static void imprimirPalindromo(String palabra) {
        //en este metodo guardamos la variable palabra en string para guardarla en el metodo palindromo el cual
        //utilizaremos .reverse para leer la palabra y imprimirla ALREVEZ utilizando el println(palindromo)
        StringBuilder palindromo = new StringBuilder(palabra).reverse();
        System.out.println(palindromo);
    }



    public static void imprimirFormatoEspecial(String palabra) {
        //en este metodo convertimos las letras en minusculas y guardamos todo el proceso en la variable resultado
        //luego utilizamos el for para leer cada variable de nuestro archivo que en nuestro caso es tilin y
        palabra = palabra.toLowerCase();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            //lo que sea vocal se imprime en asterisco y lo que no sea vocal en "#" muy facil de entender utilizando el
            //metodo if
            if (esVocal(caracter)) {
                resultado.append("*");
            } else {
                resultado.append("#");
            }
        }
        //y finalmente imprimimos la variable resultado
        System.out.println(resultado);
    }



    public static boolean esVocal(char caracter) {
        //en este metodo verificamos si la variable es char y la convertimos en minuscula para utilizar las letras
        //asignadas de la variable "caracter" para su uso en el metodo de arriba
        caracter = Character.toLowerCase(caracter); // Convertimos los carácter a minúscula para comparar
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}