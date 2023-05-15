package edu.viery.rojas.retofinal.process;
import edu.viery.rojas.retofinal.process.Mago;
import edu.viery.rojas.retofinal.process.Casa;
import edu.viery.rojas.retofinal.process.Juego;
import edu.viery.rojas.retofinal.process.Villa;
public class JugadorPrincipal extends Juego {


    public int nivelVida;
    public static final int MAX_NIVEL_VIDA = 100;
    public int posicionActual;

    public static final int BONUS_VIDA = 10;

    public int cantidadCasasVacias;

    public JugadorPrincipal(int nivelVidaInicial, int cantidadCasasVacias, int posicionInicial) {
        this.nivelVida = nivelVidaInicial;
        this.cantidadCasasVacias = cantidadCasasVacias;
        this.posicionActual = posicionInicial;

    }

    public int getCantidadCasasVacias() {
        return cantidadCasasVacias;
    }
    public int getNivelVida() {
        return nivelVida;
    }
    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }
    public boolean haPerdido() {
        return nivelVida <= 0;
    }
    public boolean haGanado(Villa villa) {
        return villa.getCantidadHadasRescatadas() == villa.getCantidadHadas();
    }
    public void recibirAtaqueOgro() {
        this.nivelVida -= Ogro.DANIO_ATAQUE;
        System.out.printf("¡El ogro te ha atacado! Tu nivel de vida ha disminuido a %d.\n", this.nivelVida);
    }
    public void perderVida(int cantidad) {
        nivelVida -= cantidad;
        if (nivelVida < 0) {
            nivelVida = 0;
        }
        System.out.printf("El jugador ha perdido %d puntos de vida y ahora tiene %d.\n", cantidad, nivelVida);
    }

    public void ganarVida(int cantidad) {
        if (nivelVida + cantidad > MAX_NIVEL_VIDA) {
            nivelVida = MAX_NIVEL_VIDA;
        } else {
            nivelVida += cantidad;
        }
        System.out.printf("El jugador ha ganado %d puntos de vida.\n", cantidad);
    }




    public boolean encontrarHadaEnCasaVacia(Villa villa) {
        Casa casa = villa.getCasaEnPosicion(this.posicionActual);
        return !casa.isOcupada() && casa.getHada() != null;
    }

    public void rescatarHadaEnCasaVacia(Villa villa) {
        Casa casa = villa.getCasaEnPosicion(this.posicionActual);
        Hada hada = casa.getHada();
        casa.setOcupada(true);
        casa.setHada(null);
        this.nivelVida += Hada.BONUS_VIDA;
        villa.incrementarCantidadHadasRescatadas();
        System.out.printf("Has rescatado a un hada y tu nivel de vida ha aumentado en %d puntos.\n", Hada.BONUS_VIDA);
    }
    public void mover(Villa Villa, int direccion) {
        // La variable "direccion" podría ser un número que indique la dirección en la que se mueve el jugador:
        // 1 = arriba, 2 = abajo, 3 = izquierda, 4 = derecha

        // Obtener la posición actual del jugador
        Casa casaActual = null;

        for (Casa casa : Villa.getCasas()) {
            if (casa.getHada() == null && !casa.isOcupada()) {
                casaActual = casa;
                break;
            }
        }

        // Obtener la casa hacia la que se mueve el jugador
        Casa nuevaCasa = null;
        switch (direccion) {
            case 1: // Mover hacia arriba
                // Buscar la casa de arriba

                break;
            case 2: // Mover hacia abajo
                // Buscar la casa de abajo

                break;
            case 3: // Mover hacia la izquierda
                // Buscar la casa de la izquierda

                break;
            case 4: // Mover hacia la derecha
                // Buscar la casa de la derecha

                break;
            default:
                // Dirección inválida
                break;
        }

        // Verificar si se encontró una casa válida para moverse
        if (nuevaCasa != null) {
            // Desocupar la casa actual
            casaActual.setOcupada(false);

            // Ocupar la nueva casa
            nuevaCasa.setOcupada(true);

            // Verificar si hay un hada para rescatar en la nueva casa
            Hada hada = nuevaCasa.getHada();
            if (hada != null && !hada.isCapturada()) {
                // Rescatar el hada y aumentar el nivel de vida
                hada.setCapturada(true);
                nivelVida++;
                // Verificar si se han rescatado 10 hadas para aumentar el nivel de vida y disminuir el poder del mago
                if (Villa.getCantidadHadasRescatadas() % 10 == 0) {
                    Mago.disminuirPoder();
                }
            }

            // Verificar si se encontró el ogro en la nueva casa
            if (nuevaCasa.isOgroPresente()) {
                // Golpear al jugador principal y disminuir el nivel de vida
                nivelVida -= Ogro.danoGolpe;
            }
        }
    }
}
