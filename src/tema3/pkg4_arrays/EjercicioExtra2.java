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
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int []lista = {1,2,3,2};
        //int []lista2 = {1,9,5,2};
        int []lista2 = {1,2,3,2};
        boolean sonIguales=true;
        
        
        for (int i=0; i< lista.length;i++){
            if(lista[i]!=lista2[i]){
                sonIguales = false;
            }
            System.out.println(lista[i]+" VS "+lista2[i]);
        }
        if(sonIguales){
            System.out.println("**SON IGUALES**");
        } else {
            System.out.println("**SON DIFERENTES**");
        }
    }
    
}
