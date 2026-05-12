/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg9.tp4;

import java.util.Scanner;

/**
 *
 * @author Kary
 */
public class Punto9TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Lector = new Scanner(System.in);

        boolean[] pagos = new boolean[10];

        int contador1 = 0; 
        int contador2 = 0; 
        for (int contador = 0; contador < 10; contador++) {

            System.out.println("el alumno " + (contador + 1) + " pago la cuota? true/false");
            pagos[contador] = Lector.nextBoolean();

            if (pagos[contador] == true) {
                contador1++;
            } else {
                contador2++;
            }
        }
        double porcentaje = (contador1 * 100.0) / 10;
        System.out.println("Cantidad de pagos: " + contador1);
        System.out.println("Cantidad de deudores: " + contador2);
        System.out.println("Porcentaje de cobranza: " + porcentaje + "%");

    }
}
    
    

