
package curse.of.java;

import java.util.Scanner;



public class Ejercicio2 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        System.out.println("ingrese el limite numerico");
        int Valor = read.nextInt();
        
        for (int i = 1;i <=Valor; i++) {
            
            System.out.println("estoy en la vuelta  " + i);
            
        }
        
    }
    
}
