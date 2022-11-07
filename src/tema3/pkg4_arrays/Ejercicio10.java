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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        int []lista = {5,4,2,5,5};
        int moda = 0, repe =0, maxrepe = 0;
        
        for(int i =0;i<lista.length;i++){
            System.out.println(lista[i]);
            for(int j=0;j<lista.length;j++){
                if(lista[i]==lista[j]){
                    repe++;
                }
            }
            if(repe>maxrepe){
                maxrepe=repe;
                moda=lista[i];
            }
        }
        System.out.println("La moda es "+moda);
    }
    
}
