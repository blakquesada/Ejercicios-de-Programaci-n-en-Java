
package matriz;

import java.util.Scanner;


public class Matriz {

  
    public static void main(String[] args) {
     int matrix [][] = new int [3][3];
     
     matrix [0][0]= 33;
      matrix [0][1]= 12;
       matrix [0][2]= 1;
        matrix [1][0]= 21;
         matrix [1][1]= 7;
          matrix [1][2]= 6;
           matrix [2][0]= 5;
            matrix [2][1]= 4;
             matrix [2][2]= 34;
             
                Scanner read = new Scanner (System.in);
              for (int f =0; f <3; f++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.println("ingrese el valor de la posicion");
                        matrix[f][c] = read.nextInt();
                    }
              }
             
             
             
             for (int f =0; f <3; f++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.println("el valor de la posicion f:" + f+"c:"+ c);
                        System.out.println("el valor es:"+ matrix[f][c]);
                        
                    }
                
            
        }
    }
    
}
