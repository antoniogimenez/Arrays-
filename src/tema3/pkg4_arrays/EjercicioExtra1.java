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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int []lista = {2,5,6,2,8};
        
        boolean sonPares=true;
        
        for(int i = 0; i < lista.length;i++){
            if (lista[i]%2 !=0){
                sonPares=false;
            }
            // nO haria falta poner el else porque si antes ya hemos dicho que si no on true son false y no 
            //hay mas opciones
        }
        if(sonPares){
            System.out.println("---SI SON PARES---");
        } else {
            System.out.println("---NO SON PARES---");
        }
    }
    
}
