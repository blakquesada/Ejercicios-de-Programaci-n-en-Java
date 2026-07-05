
package curse.of.java;

import java.util.Scanner;


public class Ejercicio6 {

    
    public static void main(String[] args) {
        
       Scanner read = new Scanner (System.in); 
       double matriz [][] = new double [4][4]; 
       double suma = 0.0;
       
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese las notas del estudiante");
                matriz [f][c] = read.nextDouble();
                suma = suma + matriz[f][c];
                    
            }
            matriz [f][3] = suma /3;
            suma = 0.0;
        }
        for (int f = 0; f < 4; f++) {
            System.out.println("las notas del alumno N°:" +" 10"+ f + "son:");
            for (int c = 0; c < 3; c++) {
                System.out.println("nota N°: +" + c + matriz[f][c]);
                
                }
                    System.out.println("el promedio de la notas del alumno son:" + matriz[f][3]);
            }
      
    }
    
}
