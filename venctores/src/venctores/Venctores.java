
package venctores;

import java.util.Scanner;


public class Venctores {


    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        //declaracion
        int vector [] = new int [4];
        
        /*vector[0] = 2;
        vector[1] = 35;
        vector[2] = 43;
        vector[3] = 157;*/
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese el valor para el indice");
            vector[i] = read.nextInt();
        
        }
        
        //recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("estoy en el indice:" + i);
            System.out.println("tengo gardado:" + vector[i]);
            System.out.println("---------------------------------");
            
        }
    }
    
}
