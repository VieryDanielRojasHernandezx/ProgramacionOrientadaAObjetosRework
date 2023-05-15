package edu.viery.rojas.retofinal.process;
import edu.viery.rojas.retofinal.process.Mago;
import edu.viery.rojas.retofinal.process.JugadorPrincipal;
import edu.viery.rojas.retofinal.process.Casa;
import edu.viery.rojas.retofinal.process.Ogro;
import edu.viery.rojas.retofinal.process.Juego;
import java.util.ArrayList;
import java.util.List;

public class Villa {
    public List<Casa> casas;
    public int cantidadHadas;
    public int cantidadHadasRescatadas;

    public int[] posiciones; // agregar atributo posiciones

    public Villa(int cantidadCasas, int cantidadHadas) {
        this.cantidadHadas = cantidadHadas;
        this.cantidadHadasRescatadas = 0;
        this.casas = new ArrayList<>();

        // Inicializar arreglo de posiciones
        this.posiciones = new int[cantidadCasas];
        for (int i = 0; i < cantidadCasas; i++) {
            posiciones[i] = i;
        }

        // Crear casas
        for (int i = 0; i < cantidadCasas; i++) {
            casas.add(new Casa(i));
        }
    }

    public List<Casa> getCasas() {
        return casas;
    }

    public int getCantidadHadas() {
        return cantidadHadas;
    }

    public int getCantidadHadasRescatadas() {
        return cantidadHadasRescatadas;
    }

    public void incrementarCantidadHadasRescatadas() {
        cantidadHadasRescatadas++;
    }

    // Implementar método getCasaEnPosicion
    public Casa getCasaEnPosicion(int posicion) {
        int index = -1;
        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i] == posicion) {
                index = i;
                break;
            }
        }
        return casas.get(index);
    }
}


