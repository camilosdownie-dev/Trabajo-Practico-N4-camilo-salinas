/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2.tp4;

import java.util.Scanner;

/**
 *
 * @author AlumnosET20
 */
public class Ejercicio2TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner Lector = new Scanner(System.in);
        int[] numeros = new int[10];
        int num_negativos = 0 ;
        int num_positivos = 0 ;
         int cantnega = 0 ;
         int cantposi = 0 ;
         int promedio_suma = 0 ;
         int promedio_resta = 0 ; 
        System.out.println("ingrese los 10 numeros enteros por teclado");
        for(int contador = 0 ; contador < 10 ; contador ++){
           numeros[contador] = Lector.nextInt();
            
        }
        for(int contador2 = 0 ; contador2 < 10 ; contador2 ++){
            if (numeros[contador2] < 0) {
                num_negativos = num_negativos + numeros[contador2];
                cantnega = cantnega + 1 ;
            }else 
              num_positivos = num_positivos + numeros[contador2];
            cantposi = cantposi + 1;
            
                
    
    }
        promedio_suma = num_positivos % cantposi ;
        promedio_resta = num_negativos % cantnega ;
        System.out.println("la suma de numeros negativos ingresados es = " + promedio_resta);
        System.out.println("la suma de numeros positivos ingresados es = " + promedio_suma);
    }
}

   

}
