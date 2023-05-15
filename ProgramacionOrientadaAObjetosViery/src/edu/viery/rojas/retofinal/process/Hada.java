package edu.viery.rojas.retofinal.process;


public class Hada extends Juego{

    private String nombre;
    public static final int BONUS_VIDA = 10;

    public boolean capturada;

    public Hada() {
        this.nombre = nombre;
        this.capturada = false;
    }

    public void darBonusVida(JugadorPrincipal jugador) {
        jugador.ganarVida(JugadorPrincipal.BONUS_VIDA);
        System.out.printf("Has ganado %d puntos de vida por rescatar un hada.\n", JugadorPrincipal.BONUS_VIDA);
    }


    public String getNombre() {
        return nombre;
    }

    public boolean isCapturada() {
        return capturada;
    }

    public void setCapturada(boolean capturada) {
        this.capturada = capturada;
    }
}

