/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg10.tp4;

/**
 *
 * @author Kary
 */
public class Punto10TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] array = new int[10];

        int min = 1;
        int max = 20;

        for (int contador = 0; contador < 10; contador++) {

            int numero;
            boolean repetido;

            do {

                repetido = false;

                numero = (int)Math.floor(Math.random() * (max - min + 1) + min);

                for (int contador1 = 0; contador1 < contador; contador1++) {

                    if (array[contador1] == numero) {

                        repetido = true;

                    }
                }

            } while (repetido);

            array[contador] = numero;
        }

        System.out.println("Numeros generados:");

        for (int contador2 = 0; contador2 < 10; contador2++) {

            System.out.println(array[contador2]);

        }
    }
    }
    

