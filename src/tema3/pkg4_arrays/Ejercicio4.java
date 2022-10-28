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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int []vector= new int[10];
        int num;
       //USANDO EL FOR
//        for(int i =0; i<vector.length;i++){
//                System.out.println("Dime un numero ");
//                num = Integer.parseInt(s.nextLine());
//                vector[i]=num;
//                if(num<0){
//                    break;
//                }
//        }
//        System.out.println("***El array esta compuesto por***");
//        for(int i =0; i<vector.length;i++){
//            if(vector[i]>=0){
//                System.out.println(vector[i]);
//            }else {
//                break;
//            }
//        }
        


        //RELLENANDO EL ARRAY CON UN WHILE 
        int i=0;
        do{
            System.out.println("Dime un numero ");
            num = Integer.parseInt(s.nextLine());
            vector[i]=num;
            i++;
        }while(num>=0 && i<vector.length);
        
        System.out.println("Muestro el array con un while");
        while(vector[i]>=0 && i<vector.length){
            System.out.println("");
            i++;
        }
    }
    
}
