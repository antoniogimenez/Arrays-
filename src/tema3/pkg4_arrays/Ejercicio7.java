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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String frase, fecha;
        
        System.out.println("Dime una fecha: ");
        fecha = s.nextLine();
        
        System.out.println("Dime una frase: ");
        frase = s.nextLine();
        
        String []date= fecha.split("/");
        
        System.out.println("***Parte 1***");
        for(int i=0; i<date.length;i++){
            System.out.println(date[i]);
        }
        
        String []palabras = frase.split(" ");
        
        System.out.println("***Parte 2***");
        for(int i=0; i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
    }
    
}
