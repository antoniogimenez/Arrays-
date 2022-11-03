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
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int []lista = {1,5,1,2};
        //int []lista2 = {1,9,5,2};
        int []lista2={2,1,5,1};
        boolean sonIguales= true;
        boolean existe=false;
        
        
        for(int i =0; i< lista.length;i++){
            int num = lista[i];
            existe = false;
            for(int j=0;j<lista2.length;j++){
                int num2 = lista2[i];
                if (lista[i]==lista2[j]){
                existe=true;
                }
            }
        if(sonIguales){
            System.out.println("**SON IGUALES**");
        } else {
            System.out.println("**SON DIFERENTES**");
        }
        }
    }
    
}
