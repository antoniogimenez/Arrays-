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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String []nombres = new String[5];
        int []edades = new int [5];
        String nombre;
        int edad;
        
        for(int i=0; i<nombres.length;i++){
            System.out.println("Nombre del alumno [* para terminar]: ");
            nombre = s.nextLine();
            nombres[i]=nombre;
            
            if(!nombre.equals("*")){
                System.out.println("Edad: ");
                edades[i] = Integer.parseInt(s.nextLine());
            } else{
                edades[i]=-1;
                break;
            }
        }
        //Imprimo los resultados
        //Recorro el vector hasta el final o hasta encontrar un negativo
//        i=0;
//        while (i<nombres.length && !nombres[i].equals("*")){
//            System.out.print(nombres[i]+"-----");
//            System.out.println(edades[i]);
//            i++;
//        }
//        
        for (int i = 0; i < nombres.length; i++) {
            if (!nombres[i].equals("*")){
                System.out.print(nombres[i]+"---->");
                System.out.println(edades[i]);
            }
            else
                break;
            
        }
    }
    
}
