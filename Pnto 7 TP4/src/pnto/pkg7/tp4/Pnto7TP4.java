/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pnto.pkg7.tp4;

/**
 *
 * @author Kary
 */
public class Pnto7TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] numeros = new int[10];
        for (int contador = 0; contador < numeros.length; contador++) {

            numeros[contador] = (int)(Math.random() * 100);

        }

        

        for (int contador1 = 0; contador1 < numeros.length; contador1++) {

            System.out.println("Posicion " + contador1 + ": " + numeros[contador1]);

        }
    }

}
