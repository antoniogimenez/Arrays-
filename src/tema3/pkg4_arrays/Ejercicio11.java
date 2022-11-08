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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int [][]numeros = new int [3][6];
        numeros[0][0] = 0;
        numeros[0][1] = 30;
        numeros[0][2] = 2;
        numeros[0][5] = 5;
        numeros[1][0] = 75;
        numeros[1][4] = 0;
        numeros[2][2] = -2;
        numeros[2][3] = 9;
        numeros[2][5] = 11;
        
        
        for(int i=0; i<numeros.length;i++){
            for (int j = 0; j < 6; j++) {
                System.out.print(" "+numeros[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
