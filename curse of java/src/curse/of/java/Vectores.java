
package curse.of.java;

import java.util.Scanner;

/**
 *
 * @author windows 11
 */
public class Vectores {

  
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        //declaracion
       int vector [] = new int [4];
       //asignacion manual
       /*vector [0] =2;
       vector [1] = 35;
       vector [2] =40;
       vector [3] = 45;*/
       
       //asignacion por teclado
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese el valor para el indice:" + i );
            vector[i] = read.nextInt();
        }
       //Recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("estoy en el indice:" + i);
            System.out.println("tengo guardado" + vector[i]);
            
            System.out.println("-----------------------------");
            
        }
    }
    
}
