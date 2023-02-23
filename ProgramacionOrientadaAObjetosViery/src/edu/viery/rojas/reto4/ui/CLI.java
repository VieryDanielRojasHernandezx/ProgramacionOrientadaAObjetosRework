package edu.viery.rojas.reto4.ui;

/**
 *
 */
public class CLI {
    /**
     *
     */
    public static void Muestrameelmenu() {


        String meses = "Ene-Feb-Mar Abr-May-Jun Jul-Ago-Sep Oct-Nov-Dic";
        String sabor_1 = "Chocolate 111 483 471 427";
        String sabor_2 = "Vainilla 192 500 355 158";
        String sabor_3 = "Fresa 289 470 474 160";
        String sabor_4 = "Oreo 415 114 161 308";
        String[][] arreglo = {
                meses.split(" "),
                sabor_1.split(" "),
                sabor_2.split(" "),
                sabor_3.split(" "),
                sabor_4.split(" ")
        };
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0) {
                System.out.print("\t\t");
            }
            for (int j = 0; j < arreglo[i].length; j++) {
                if (i == 0) {
                    System.out.print(arreglo[i][j] + "\t");
                } else {
                    System.out.print(arreglo[i][j]);
                    if (j == 0) {
                        if (i < 3) {
                            System.out.print("\t");
                        } else {
                            System.out.print("\t\t");
                        }
                    } else {
                        System.out.print("\t\t");
                    }

                }
            }
            System.out.println();
        }
/**
 imprimir tabla del analicis de mercado
 */
        int[] sumTrimestre = {0, 0, 0, 0};
        for (int i = 1; i < arreglo.length; i++) {
            int ind = 1;
            int max = Integer.parseInt(arreglo[i][ind]);
            for (int j = 1; j < arreglo.length; j++) {
                if (max <= Integer.parseInt(arreglo[i][j])) {
                    ind = j;
                    max = Integer.parseInt(arreglo[i][ind]);
                }
                if (i > 1) {
                    sumTrimestre[j - 1] += Integer.parseInt(arreglo[i][j]);
                    /**
                     "arreglo [][] " delimita filas y columnnas
                     */
                }
            }
            System.out.println("El trimestre que más se vende por " + arreglo[i][0] + " es: " + arreglo[0][ind] + "(" + arreglo[i][ind] + ")");
        }
        /**
         suma del trimestre que mas vende
         */
        int maxTrimestre = 0;
        int ind = 0;
        for (int i = 0; i < sumTrimestre.length; i++) {
            if (maxTrimestre <= sumTrimestre[i]) {
                maxTrimestre = sumTrimestre[i];
                ind = i;
            }
        }
        System.out.println("\nEl trimestre que más se vendio (sin importar el sabor del chocolate) fue: " + arreglo[0][ind] + "(" + sumTrimestre[ind] + ")");
        /**
         imprime el valor de el timestre mas vendido general  sin que afecte el chocolate
         */
    }

}