
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numero = read.nextInt();
        
        
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
            
        }
       
    }
    
}
