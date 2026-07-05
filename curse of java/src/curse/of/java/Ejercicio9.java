
package curse.of.java;

import java.util.Scanner;


public class Ejercicio9 {

 
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
       
        int matriz [][] = new int[4][5];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                 matriz[i][j] = 5;
               
            }    
        }
            for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                
                System.out.print(matriz[i][j]);
                     }
                System.out.println(" ");
            }
    }
    
}
