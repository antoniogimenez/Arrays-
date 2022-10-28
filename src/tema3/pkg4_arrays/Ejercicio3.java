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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int []notas=new int[5];
        int nota;
        int max, min, suma=0;
        double media;
        //Para meter los valores por teclado
        
        for(int i = 0; i<notas.length;i++){
            System.out.println("Introduce Las notas del alumno: ");
            nota = Integer.parseInt(s.nextLine());
            notas[i]=nota;
            suma = suma + nota;
            
        }
        media = suma/notas.length;
        
        //Hacemos el analisis 
        min=notas[0];
        max=notas[0];
        for(int i = 0; i<notas.length;i++){
            if (notas[i]>max){
                max = notas[i];
            }
            if (notas[i]<min){
                min = notas[i];
            }
        }
        System.out.println("***RESULTADO***");
        System.out.println("El mayor es el "+max);
        System.out.println("El minimo es el "+min);
        System.out.println("La media es "+media);
    }
    
}
