package edu.viery.rojas.retofinal.process;

public class Ogro extends Juego{ //esta herencia no tiene sentido, no se puede decir que un Ogro es un Juego
    public static int danoGolpe = 10;
    public static int nivelFuerza = 100;

    public int vida;
    public static int DANIO_ATAQUE;

    public Ogro(int vida, int danioAtaque) {
        this.vida = vida;
        this.DANIO_ATAQUE = danioAtaque;
    }

    // Otros métodos de la clase Ogro

    public void atacar(JugadorPrincipal jugador) {
        jugador.perderVida(DANIO_ATAQUE);
        System.out.printf("El ogro ha atacado al jugador y le ha quitado %d puntos de vida.\n", DANIO_ATAQUE);
    }





    public static int getNivelFuerza() {
        return nivelFuerza;
    }

    public static void setNivelFuerza(int nivelFuerza) {
        Ogro.nivelFuerza = nivelFuerza;
    }

    public static void disminuirFuerza() {
        nivelFuerza -= 10;
    }

}
