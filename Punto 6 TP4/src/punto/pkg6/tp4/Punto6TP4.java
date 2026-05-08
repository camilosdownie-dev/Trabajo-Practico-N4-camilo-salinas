/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg6.tp4;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Punto6TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Lector = new Scanner(System.in);
         int numeros_cero = 0;
         int numeros_posi = 0 ;
         int numeros_nega = 0 ;
            
        int[] numeros = new int[10];
        System.out.println("ingrese los 10 numeros positivos negativos o ceros");
        for ( int contador = 0 ; contador < 10 ; contador++){
            numeros[contador] = Lector.nextInt();
            
        }
        for(int contador2 = 0 ; contador2 < 10 ; contador2 ++){
            if (numeros[contador2] == 0){
                numeros_cero ++ ;
            }else if (numeros[contador2] < 0 ){
                numeros_nega ++ ;
            } else 
                numeros_posi ++ ;
                }
       System.out.println("La cantidad de numeros ingresador positivos es =" + numeros_posi + " la de negativos es= " + numeros_nega + " y la que son igual a 0 es " + numeros_cero );
    }
    
}
