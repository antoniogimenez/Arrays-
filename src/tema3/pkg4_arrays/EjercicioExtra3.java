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
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        char []tablaAux=new char[10];
        int []lista = {1,5,1,2};
        //int []lista2 = {1,9,5,2};
        int []lista2={2,1,5,1};
        boolean sonIguales= true;
        
        //Paso 1 relleno la tabla auxiliar
        //numero de lista
        for(int i =0; i< lista.length;i++){
            int num = lista[i];
            tablaAux[num]='x';
            
        }
        //Imprimo la tabla AUx
        for(int i=0;i<tablaAux.length;i++){
            System.out.println("Posicion "+i+": "+tablaAux[i]);
        }
        //Paso 2 COmpruebo si los elementos de la lista 2 se encuentran marcados en la tabla Aux
        for(int i=0;i<lista2.length;i++){
            int num2 = lista2[i];
            if (tablaAux[num2]!='x'){
                sonIguales=false;
            }
        }
        if(sonIguales){
            System.out.println("**SON IGUALES**");
        } else {
            System.out.println("**SON DIFERENTES**");
        }
    }
    
}
