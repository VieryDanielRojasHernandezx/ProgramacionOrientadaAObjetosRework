package edu.viery.rojas.retofinal.process;

public class Mago extends Juego{
    public static int poder;

    public int cantidadHadasCapturadas;

    public int getCantidadHadasCapturadas() {
        return cantidadHadasCapturadas;
    }

    public void setCantidadHadasCapturadas(int cantidadHadasCapturadas) {
        this.cantidadHadasCapturadas = cantidadHadasCapturadas;
    }

    public Mago(int poderInicial, int cantidadHadasCapturadas) {
        this.poder = poderInicial;
        this.cantidadHadasCapturadas = cantidadHadasCapturadas;
    }

    public static void disminuirPoder() {
        // Disminuir el poder del mago en 1
        poder--;
    }

    public int getPoder() {
        return poder;
    }

    //getCantidadHadasRescatadas
    public void setPoder(int poder) {
        this.poder = poder;
    }
}

