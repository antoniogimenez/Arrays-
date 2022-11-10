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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String []alumnos = new String [5];
        alumnos[0] = "Juan  ";
        alumnos[1] = "Celia ";
        alumnos[2] = "Alfedo";
        alumnos[3] = "Maria";
        alumnos[4] = "Pedro ";
        double suma;
        double [][]notas = new double [5][4];
        
        notas[0][0] = 5;
        notas[0][1] = 6;
        notas[0][2] = 7;
        notas[1][0] = 4;
        notas[1][1] = 2;
        notas[1][2] = 7;
        notas[2][0] = 6;
        notas[2][1] = 8;
        notas[2][2] = 9;
        notas[3][0] = 10;
        notas[3][1] = 8;
        notas[3][2] = 9;
        notas[4][0] = 4;
        notas[4][1] = 2;
        notas[4][2] = 4;
        
//        PARA LA NOTA MEDIA
        for(int i = 0; i < notas.length; i++) {
            suma =0;
            for (int j = 0; j < 3; j++) {
                suma = suma + notas[i][j];
            }
            notas[i][3] = suma/3;
        }
        System.out.println("        E1    E2    E3   MEDIA");
        System.out.println("-------------------------------");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(alumnos[i]);
            for (int j = 0; j < notas[0].length; j++) {
                System.out.printf(" %.2f ",notas[i][j]);  //para que salga en cuadrado es sin LN
            }
            System.out.println(" ");
        }
        System.out.println("------------------------------");
        
        //para saber los suspensos
        int suspenso;
        int [][]suspensos = new int[1][3];
//        for (int j = 0; j < 3; j++) {
//            suspenso=0;
//            for (int i = 0; i < notas.length; i++) {
//                if(notas[i][j]<5){
//                    suspenso++;
//                    
//                } 
//            }
//            System.out.print(+suspenso+"     ");
//        }
        System.out.print("Suspen: ");
        for (int j = 0; j < 3; j++) {
            suspenso=0;
            for (int i = 0; i <notas.length; i++) {
                if (notas[i][j]<5){
                    suspenso++; 
                }
                
            }
            suspensos[0][j]=suspenso;
            System.out.print(+suspensos[0][j]+"     ");
        }




        //MEJOR MEDIA
        System.out.println();
        double  mejorMedia=0;
        int posicion =0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i][3]>mejorMedia){
                mejorMedia = notas[i][3];
                posicion = i;
            }
        }
        System.out.println("El alumno con mejor media es "+alumnos[posicion]);
    }
        
}
  

