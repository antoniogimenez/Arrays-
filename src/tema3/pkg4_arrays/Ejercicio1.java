/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg4_arrays;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String []animales={"perro","gato","conejo","pollo","leon"};
        
        //Mostrar las posiciones del array de 2 formas:
        
        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        System.out.println(animales[4]);
        
        for (int i = 0; i < animales.length; i++){  // EL LENGTH NO LLEVA LOS  () PARA ARRAYS
            System.out.println(animales[i]);
        }
        
        //PARTE 2
        
        int []numeros={2,4,6,8,10};
        
        
        for(int i = numeros.length-1; i >=0;i--){
            System.out.println(numeros[i]);
        }
    }
    
}
