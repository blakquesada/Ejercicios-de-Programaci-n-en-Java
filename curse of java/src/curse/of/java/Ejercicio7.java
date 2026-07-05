
package curse.of.java;

import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int vector [] = new int [15];
        
        for (int i = 0; i < 15; i++) {
            System.out.println("INGRESE EL NUMERO");
             vector[i] = read.nextInt();
             
        }
          int cont =0;
        for (int i = 0; i < 15; i++) {
            if (vector[i]==3) {
                cont = cont +1;
            }
        }
        System.out.println("el numero de veces son:"+ cont);
    }
    
}
