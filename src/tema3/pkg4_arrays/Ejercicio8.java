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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String []alumnos = {"Francisco","Marcos","Laura","Marta","Pedro"};
        double []primerTrimestre = {7,10,4,5,6};
        double []segundoTrimestre = {4,10,10,5,5};
        double []tercerTrimestre = {1,10,8,2,3};
        
        double mediaAlumno, media1=0, media2=0, media3=0;
        int posicion;
        
        System.out.println("---Listado de alumnos---");
        for(int i=0; i<alumnos.length;i++){
            System.out.println(i+1+". "+alumnos[i]);
        }
        
        System.out.println("\nDime la posicion del alumno que quieres buscar: ");
        posicion = Integer.parseInt(s.nextLine());
        
        mediaAlumno = (primerTrimestre[posicion-1]+ segundoTrimestre[posicion-1]+tercerTrimestre[posicion-1])/3;
        System.out.printf("La media de %s es %.2f \n",alumnos[posicion-1],mediaAlumno);
        
        
        //La media de los trimestres
        System.out.println("-------- media de los trimestres --------");
//        media1 = (primerTrimestre[0]+primerTrimestre[1]+primerTrimestre[2]+primerTrimestre[3]+primerTrimestre[4])/primerTrimestre.length;
//        media2 = (segundoTrimestre[0]+segundoTrimestre[1]+segundoTrimestre[2]+segundoTrimestre[3]+segundoTrimestre[4])/segundoTrimestre.length;
//        media3 = (tercerTrimestre[0]+tercerTrimestre[1]+tercerTrimestre[2]+tercerTrimestre[3]+tercerTrimestre[4])/tercerTrimestre.length;
        for (int i = 0; i < primerTrimestre.length; i++) {
            media1 = media1 + primerTrimestre[i]; 
            media2 = media2 + segundoTrimestre[i];
            media3 = media3 + tercerTrimestre[i];
         }
         System.out.println("La media del primer trimestre de todo el grupo es: "+(media1 / (primerTrimestre.length)));
         System.out.println("La media del segundo trimestre de todo el grupo es: "+(media2 / (segundoTrimestre.length)));
         System.out.println("La media del tercer trimestre de todo el grupo es: "+(media3 / (tercerTrimestre.length)));


        System.out.println("La media del Primer trimestre: "+media1);
        System.out.println("La media del Segundo trimestre: "+media2);
        System.out.println("La media del Tercer trimestre: "+media3);
    }
    
}
