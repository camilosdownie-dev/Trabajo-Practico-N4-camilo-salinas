/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg5.tp4;



/**
 *
 * @author Alumno
 */
public class Punto5TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] numeros = new int[20];
        for (int contador = 0 ; contador < 20 ; contador ++){
            numeros[contador] = (contador + 1) * 2 ;
                    
        }
        for (int contador2 = 0 ; contador2 < 20 ; contador2++){
            System.out.println("Posicion " + contador2 + ": " + numeros[contador2]);
        }
    }
    
}
