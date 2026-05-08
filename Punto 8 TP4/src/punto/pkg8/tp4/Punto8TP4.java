/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg8.tp4;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Punto8TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Lector = new Scanner(System.in);
    String[] nombres = new String[20] ;
    double[] sueldos = new double[20] ; 
    
    int indice_mayor = 0 ; 
    
    for(int i = 0 ; i < 20 ; i++) {
        System.out.println("Ingrese el nombre su luego el sueldo");
        nombres[i] = Lector.nextLine() ;
        sueldos[i] = Lector.nextDouble() ;
        
        for(int j = 0 ; j < i ; j++) {
            if (sueldos[j] < sueldos[j+1] )
                indice_mayor = j+1 ;
        }
        
        
    }
    System.out.println ("nombre del empleado encontrado " + nombres[indice_mayor]);
            System.out.println("sueldo mayo encontrado " + sueldos[indice_mayor]);
    
     }
    
}
