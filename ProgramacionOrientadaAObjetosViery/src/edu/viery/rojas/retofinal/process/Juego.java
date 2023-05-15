package edu.viery.rojas.retofinal.process;

public class Juego {
        public static void jugar() {
            // Crear una nueva villa
            Villa villa = new Villa(3, 3);

            // Crear un nuevo jugador principal
            JugadorPrincipal jugador = new JugadorPrincipal(5, 3, 0);

            // Inicializar el juego
            System.out.println("Bienvenido al juego de rescate de Tilines!");
            System.out.printf("Tu nivel de vida actual es %d y tienes %d casas vacías para buscar hadas.\n", jugador.getNivelVida(), jugador.getCantidadCasasVacias());
            System.out.println("Tu objetivo es encontrar y rescatar a todas las hadas antes de que el malvado mago las capture.");

            // Jugar hasta que el jugador gane o pierda
            while (!jugador.haPerdido() && !jugador.haGanado(villa)) {
                // Imprimir información sobre la villa
                System.out.printf("Hadas rescatadas: %d/%d\n", villa.getCantidadHadasRescatadas(), villa.getCantidadHadas());
                System.out.printf("Casas vacías restantes: %d\n", jugador.getCantidadCasasVacias());

                // Obtener la dirección en la que el jugador quiere moverse
                int direccion = EntradaSalida.leerDireccion();
                System.out.println("El jugador se mueve en dirección: " + direccion);

                // Mover al jugador
                jugador.mover(villa, direccion);

                // Verificar si el jugador encontró una casa vacía con un hada
                if (jugador.encontrarHadaEnCasaVacia(villa)) {
                    // Preguntar al jugador si quiere ayudar al hada
                    boolean quiereAyudar = EntradaSalida.leerRespuesta("¿Quieres ayudar al hada? (Si/No)");

                    // Si el jugador decide ayudar al hada, rescatarla y aumentar el nivel de vida del jugador
                    if (quiereAyudar) {
                        jugador.rescatarHadaEnCasaVacia(villa);
                    }
                }
            }

            // Mostrar resultado final
            if (jugador.haPerdido()) {
                System.out.println("Has perdido. El mago ha capturado todas las hadas.");
            } else {
                System.out.println("¡Felicidades! Has rescatado a todas las hadas y ganado el juego.");
            }
        }
}


