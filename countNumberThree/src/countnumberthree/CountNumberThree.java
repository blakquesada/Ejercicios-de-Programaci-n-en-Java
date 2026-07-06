
package countnumberthree;

import java.util.Scanner;


public class CountNumberThree {

    
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
       int vector [] = new int [15];
        int suma=0;
       
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese un nuemro");
            vector[i] = read.nextInt();
                    
        }
         for (int i = 0; i < vector.length; i++) {
           
             System.out.println("los numeros son:" +vector[i]);
                if (vector[i]==3) {
                  suma = suma +1;
             }
                    
            }
          System.out.println("las veces que se repitio el numero 3 fueron" + suma);
          
    }
    
}
