
package curse.of.java;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        System.out.println("ingrese el limite numerico");
        int limite = read.nextInt();
        
        
        for (int i = 200; i <= limite; i+=2) {
            System.out.println("estoy en la vuelta: " + i);
        }
        int cont = 200;
        while(cont<250){
            System.out.println("estoy en la vuelta:" +  cont);
            cont+=2;
        }
                
                
               
    }
    
}
