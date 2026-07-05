
package operadorternario;

import java.util.Scanner;


public class OperadorTernario {

    
    public static void main(String[] args) {
        double promedio;
        String condicionFinal;
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("ingrese su promedio");
        promedio = read.nextDouble();
        
        condicionFinal = promedio >=6 ? "aprobado" : "desaprobado";
        System.out.println("la condicion final del alumno es :" + condicionFinal);
    }
    
}
