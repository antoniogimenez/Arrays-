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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int [][]numeros = new int [5][5];
        int suma;
        int suma1;
        
        for(int i=0; i<numeros.length;i++){
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = (int)(Math.random()*10);
                System.out.print(" "+numeros[i][j]+" ");
            }
            System.out.println("");
            
        }
        //Para sumar las filas
        for(int i=0; i<numeros.length;i++){
            suma=0;
            for (int j = 0; j < 5; j++) {
                suma = numeros[i][j]+suma;
            }
            System.out.println("La suma de la fila "+i+" es "+suma);
            
        }
        //PARA SUMAR LAS COLUMNAS
        for(int j=0; j<numeros.length;j++){
            suma1=0;
            for (int i = 0; i < 5; i++) {
                suma1 = numeros[i][j]+suma1;
            }
            System.out.println("La suma de la columna "+j+" es "+suma1);
            
        }
    }
    
}
