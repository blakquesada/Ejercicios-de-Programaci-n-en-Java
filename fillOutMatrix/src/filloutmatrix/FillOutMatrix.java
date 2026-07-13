
package filloutmatrix;

import java.util.Scanner;


public class FillOutMatrix {

 
    public static void main(String[] args) {
   int matrix[][] = new int [4][5]; 
      Scanner read = new Scanner (System.in);
      
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                matrix[f][c] = 5;
                System.out.print(matrix[f][c]);
                
                
            }
            System.out.println( );
        }
        
      
      
      
       
        
    
    
    }
}
