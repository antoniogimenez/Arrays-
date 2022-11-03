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
public class Ejercicio7bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
       
        String linea= "alicia;peralta;manduca;alicia.peralta@gmail.com;600554433";
        
        String []palabras= linea.split(";"); 
        
        for(int i=0; i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
        
        String nombreCompleto = palabras[0]+" "+palabras[1]+" "+palabras[2];
        
        //Definimos el telefono
        String telefono = palabras[palabras.length-1];
        
        //Definimos la cadena del correo 
        System.out.println("El correo esta formado por.....");
        String []correo = palabras[3].split("@");
        for (int i=0; i<correo.length;i++){
            System.out.println(correo[i]);
        }
        String usuario = correo[0];
        
        
        
        System.out.println("----------------------");
        System.out.println("El telefono es "+telefono);
        System.out.println("El usuario es "+usuario);
        System.out.println("El nombre completo es: "+nombreCompleto);
        
    }
    
}
