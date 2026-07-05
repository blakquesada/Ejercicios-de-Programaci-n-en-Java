
package curse.of.java;

import java.util.Scanner;


public class Ejercicio10 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
       int vuelos [][] = new int [6][3];
       
       // carga de datos
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrse la cantidad de hacientos para el destino:" + i + "horario:" + j);
                vuelos[i][j] = read.nextInt();
                
            }
            
        }
        
        // venta de hacientos
       Scanner read2 = new Scanner (System.in);
       String bandera = "";
      
       while(!bandera.equals("finishd")){
           int destino,horario,asientos;
           System.out.println("ingrese el numero de destino");
           destino = read.nextInt();
           
           System.out.println("ingrese el horario");
           horario = read.nextInt();
           
           System.out.println("ingrese el numero de asientos");
           asientos = read.nextInt();
           
           if (vuelos[destino][horario] >= asientos) {
               
               System.out.println("su reserva fue realizada con exito");
               vuelos[destino][horario] = vuelos[destino][horario] - asientos;
           }
           else
               if (vuelos[destino][horario] <= asientos) {
                   System.out.println("lo siento ya no hay asientos disponibles");
               
           }
           System.out.println("desea continuar reservando digite finishd para cerrar ");
           bandera = read2.nextLine();
       }
       
    }
    
}
