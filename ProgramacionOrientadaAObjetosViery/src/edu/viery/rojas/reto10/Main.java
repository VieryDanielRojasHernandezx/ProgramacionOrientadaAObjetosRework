package edu.viery.rojas.reto10;
import edu.viery.rojas.reto10.ui.*;
import edu.viery.rojas.reto10.ui.Entrevistador;


/**
 * esta clase la utilizaremos para llamar a otra clase junto con sus constructores :)
 */

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto Empleado(0,1,2,3,4,5) por cada clase que tengamos enlazada con la clase principal "Empleado"
        Empleado empleado1 = new Empleado(30, "Juan", 5000);
        Empleado empleado2 = new Entrevistador("Pedro",37, 4500, "Español");
        Empleado empleado3 = new Gerente("Marcos", 48, 4000, "Ventas");
        Empleado empleado4 = new JrEnginner("Alan", 22, 2400, "Java");
        Empleado empleado5 = new Programador("María", 25, 3500, "Java");

        // Llamamos o por asi decirlo asignamos 
        // los métodos trabajar(), realizarEntrevista();, administrar();, escribircodigo(); en los objetos empleado
        empleado1.trabajar();

        empleado2.trabajar();
        empleado2.realizarEntrevista();

        empleado3.trabajar();
        empleado3.administrar();

        empleado4.trabajar();
        empleado4.escribirCodigo();

        empleado5.trabajar();
        empleado5.escribirCodigo();

    }
}