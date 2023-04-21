package edu.viery.rojas.reto10.ui;

public class Gerente extends Empleado {
    public String departamento;
    public int edad;
    public Gerente(String nombre,int edad , int salario, String departamento) {
        super(edad,nombre,salario);
        this.departamento = departamento;
        this.edad = edad;

    }

    public void administrar() {
        System.out.println(nombre + " está administrando el departamento de " + departamento + "...");
    }

}