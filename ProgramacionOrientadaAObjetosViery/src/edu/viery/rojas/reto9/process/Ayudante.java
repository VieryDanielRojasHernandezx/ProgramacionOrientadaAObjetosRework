package edu.viery.rojas.reto9.process;
import java.util.Random;

/**
 * En este programa utilizaremos constructores y diferentes tipos de string y int para guardar los objetos.
 *---------------------------------------------------------------------------------------------------------------------
 * utilizaremos los int para usarlos despues con los rand.nextint con lo que eligira como por ejemplo la variable de
 * ojos que solo le ponemos al mismo random el valor entre 1 o 2 ojos
 *---------------------------------------------------------------------------------------------------------------------
 * despues utilizaremos mas adelante el constructor "Ayudante" al cual le aplicamos toda la informacion que se
 * conseguira en un futuro metiendole los int y los string los cuales como dije guardaran informacion de ellos
 * ---------------------------------------------------------------------------------------------------------------------
 *  utilizaremos metodos return para que nos regresa la informacion que los random.nextint nos da y se guardara en la
 *  variable en la que la introducimos el mismo.
 *  ---------------------------------------------------------------------------------------------------------------------
 *  Luego en el metodo "ImprimirCaracteristicas" como dice obviamente nos dara la informacion de los ayudantes de forma
 *  exacto metiendole los atributos adentro de los printf para que nos de el valor que se guardo de cada una de ellos y
 *  nos los informe a nosotros al ejecutarlo.
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

    // Método para imprimir las características de cada ayudante
    public void imprimirCaracteristicas() {
        System.out.println(" con " + numOjos + " ojos, piel " + colorPiel + ", altura " + altura);
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