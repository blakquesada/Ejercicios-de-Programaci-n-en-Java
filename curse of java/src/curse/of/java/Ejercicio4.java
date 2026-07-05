
package curse.of.java;

import java.util.Scanner;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("ingrese una palabra");
        String palabra = read.next();
        
        while(!palabra.equalsIgnoreCase("salir")){
            System.out.println("la palñabra es: " + palabra);
            palabra = read.next();
            
        }
    }
    
}
