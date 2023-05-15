package edu.viery.rojas.retofinal.process;

public class Casa extends Juego {
    public int numero;
    public boolean ocupada;
    public boolean ogroPresente;
    public Hada hada;



    public Casa(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.ogroPresente = false;
        this.hada = null;
    }


    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean isOgroPresente() {
        return ogroPresente;
    }

    public void setOgroPresente(boolean ogroPresente) {
        this.ogroPresente = ogroPresente;
    }

    public Hada getHada() {
        return hada;
    }

    public void setHada(Hada hada) {
        this.hada = hada;
    }
}