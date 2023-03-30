package edu.viery.rojas.reto9.process;
import java.util.Random;

/**
 * En este programa utilizaremos constructores
 */
 class Ayudante {
    private int numOjos;
    private String colorPiel;
    private String altura;
    private int nivelCrearObjetos;
    private int nivelArreglarCosas;
    private int nivelDestructivo;

    // Constructor al que le damos todos los atributos
    public Ayudante(int numOjos, String colorPiel, String altura, int nivelCrearObjetos, int nivelArreglarCosas, int nivelDestructivo) {
        this.numOjos = numOjos;
        this.colorPiel = colorPiel;
        this.altura = altura;
        this.nivelCrearObjetos = nivelCrearObjetos;
        this.nivelArreglarCosas = nivelArreglarCosas;
        this.nivelDestructivo = nivelDestructivo;
    }

    // Constructor sin atributos en el cual pondremos las variables aleatorias para que el rand.nextint eliga una de
    // las variables introducidas
    public Ayudante() {
        Random rand = new Random();
        // Generamos valores al azar para cada atributo
        this.numOjos = rand.nextInt(2) + 1; // 1 o 2 ojos
        this.colorPiel = rand.nextBoolean() ? "morenito" : "blanquito";
        this.altura = rand.nextBoolean() ? "mediana" : "alta";
        this.nivelCrearObjetos = rand.nextInt(5) + 1; // nivel entre 1 y 5
        this.nivelArreglarCosas = rand.nextInt(5) + 1; // nivel entre 1 y 5
        this.nivelDestructivo = rand.nextInt(5) + 1; // nivel entre 1 y 5
    }

    // Métodos para acceder a los atributos o en palabras mas simples que nos daran la informacion aleatoria y despues
    // nos ayudara a mostrarla
    public int getNumOjos() {
        return numOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public String getAltura() {
        return altura;
    }

    public int getNivelCrearObjetos() {
        return nivelCrearObjetos;
    }

    public int getNivelArreglarCosas() {
        return nivelArreglarCosas;
    }

    public int getNivelDestructivo() {
        return nivelDestructivo;
    }

    // Método para imprimir las características del ayudante
    public void imprimirCaracteristicas() {
        System.out.println("Ayudante con " + numOjos + " ojos, piel " + colorPiel + ", altura " + altura);
        System.out.println("Nivel para crear objetos: " + nivelCrearObjetos);
        System.out.println("Nivel para arreglar cosas: " + nivelArreglarCosas);
        System.out.println("Nivel destructivo: " + nivelDestructivo);
    }

    public static void main(String[] args) {
        // Creamos cinco ayudantes con valores al azar
        Ayudante ayudante1 = new Ayudante();
        Ayudante ayudante2 = new Ayudante();
        Ayudante ayudante3 = new Ayudante();
        Ayudante ayudante4 = new Ayudante();
        Ayudante ayudante5 = new Ayudante();

        // Imprimimos las características de cada ayudante
        ayudante1.imprimirCaracteristicas();
        ayudante2.imprimirCaracteristicas();
        ayudante3.imprimirCaracteristicas();
        ayudante4.imprimirCaracteristicas();
        ayudante5.imprimirCaracteristicas();
    }
}