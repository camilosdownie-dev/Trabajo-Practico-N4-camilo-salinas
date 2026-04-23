/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico.pkg1.tp4;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class EJercico1Tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        int[] numeros = new int[7];
       // for(int contador = 0 ; contador < 7 ; contador++){
       //     System.out.println("inrgese 7 numeros enteros");
       //     numeros[contador] = Lector.nextInt() ;
       // }
       // for(int contador2 = 0 ; contador2 < 7 ; contador2 ++){
       //     System.out.println("El numero ingresado es " + numeros[contador2]);
       // }
       // numeros[0] = 108;
       int contador = 0 ;
       int contador2 = 0 ;
       System.out.println("ingrese 7 numeros enteros");
       while (contador < 7){
           numeros[contador] = Lector.nextInt();
           contador ++ ;
                           
           
       }
       while(contador2 < 7){
        System.out.println("El numero ingresador es igual a " + numeros[contador2]);   
        contador2 ++;
       }
    }
           
         

    
}
