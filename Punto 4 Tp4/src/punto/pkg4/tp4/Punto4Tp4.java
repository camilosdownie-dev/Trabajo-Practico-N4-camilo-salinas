/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg4.tp4;

import java.util.Scanner;

public class Punto4Tp4 {

   
    public static void main(String[] args) {
    Scanner Lector = new Scanner(System.in);
    System.out.println("ingresar la cantidad de alumnos");
    int cantidad = Lector.nextInt(); 
    int[] alumnos = new int[cantidad] ;
    int promedio = 0 ;
    double promediofr = 0 ;
    int cant_sup = 0;
     System.out.println("ingrese las notas de los alumnos en orden en que se ingresaron");
    for (int contador = 0 ; contador < cantidad ; contador ++){
              alumnos[contador] = Lector.nextInt();
    }
    for(int contador2 = 0 ; contador2 < cantidad ; contador2 ++){
        promedio = promedio + alumnos[contador2];
        
    }
       promediofr = promedio / cantidad ;
       for (int contador3 = 0 ; contador3 < cantidad ; contador3 ++){
           if (alumnos[contador3] > promediofr){
               System.out.println("el alumno con la nota " + alumnos[contador3] + " tiene una nota superior al promedio");
               cant_sup ++ ;
           }
           
       }
        System.out.println("la cantidad de alumnos superiores a la media es " + cant_sup);
    }
    
}
