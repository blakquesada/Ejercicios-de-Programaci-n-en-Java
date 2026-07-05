
package curse.of.java;

import java.util.Scanner;


public class Condicional_If {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int numero1 , numero2, resul;
        
        System.out.println("ingrese el primer numero");
        numero1 = read.nextInt();
        
        System.out.println(" ingrese el segundo numero");
        numero2 = read.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("numero 1 es mayor");
            
        }else
            if(numero2 > numero1){
                System.out.println("el numero 2 es mayor");
                
            }
   
           }
    
}
