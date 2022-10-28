/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg4_arrays;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int []numeros=new int[5];
        int num;
        
        //Para meter los valores por teclado
        for(int i = 0; i<numeros.length;i++){
            System.out.println("Introduce un numero por teclado: ");
            num = Integer.parseInt(s.nextLine());
            numeros[i]=num;
        }
        
        System.out.println("\nARRAY DE NUMEROS");
        System.out.println("------------------------");
        for(int i = 0; i< numeros.length; i++){
            System.out.printf("numeros[%d] %10d\n",i,numeros[i]);
        }
        
        //["+numeros[0]+"|"+numeros[1]+"|"+numeros[2]+"|"+numeros[3]+"|"+numeros[4]+"]"
        System.out.printf("Array ---> [");
        for(int i = 0; i< numeros.length-1; i++){
            System.out.printf("%d |",numeros[i]);
        }
        System.out.println("5]");
    }
    
}
