
package curse.of.java;

import java.util.Scanner;


public class OperadorTernario {

   
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        double Promedio;
        String condicionFinal;
        
        System.out.println("ingrese su promedio general");
        Promedio = read.nextDouble();
        
        condicionFinal = Promedio>=6? "aprobado" : "desaprobado";
        
        System.out.println("la condicion final es: " + condicionFinal);
     
    }
    
}
