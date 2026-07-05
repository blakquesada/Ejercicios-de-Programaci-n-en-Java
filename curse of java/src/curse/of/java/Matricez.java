
package curse.of.java;

import java.util.Scanner;


public class Matricez {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int matriz [][] = new int [3][3];
        
        for (int f = 0; f < 3; f++) {
            
            for (int c = 0; c < 3; c++) {
                System.out.println("el valor de la pocicio f:" +f+ "y la pocicion c:" + c);
               matriz[f][c] = read.nextInt();
                }
            }
        //asignacion
        /*matriz [0][0] =44;
        matriz [0][1] =6;
        matriz [0][2] =41;
        matriz [1][0] =34;
        matriz [1][1] =43;
        matriz [1][2] =4;
        matriz [2][0] = 5;
        matriz [2][1] = 23;*/
        
        for (int f = 0; f < 3; f++) {
            
            for (int c = 0; c < 3; c++) {
                System.out.println("el valor de la pocicio f:" +f+ "y la pocicion c:" + c);
                System.out.println("es de: " + matriz[f][c]);
                System.out.println("----------------------------------------");
            }
            
        }
        
    }    
}
