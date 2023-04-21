package edu.viery.rojas.reto10.ui;

public class JrEnginner extends Empleado{

    public int edad;
    public int salario;

    public String nombre;
    public String lenguajeProgramacion;


    public JrEnginner(String nombre, int edad, int salario, String lenguajeProgramacion) {

        super(edad, nombre, salario);
        this.salario = salario;
        this.nombre = nombre;
        this.edad = edad;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
    public void escribirCodigo() {
        System.out.println(this.nombre + " está escribiendo código en " + this.lenguajeProgramacion + "...");

    }
}