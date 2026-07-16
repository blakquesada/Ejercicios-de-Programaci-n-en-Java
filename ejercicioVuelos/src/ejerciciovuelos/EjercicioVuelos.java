
package ejerciciovuelos;

import java.util.Scanner;


public class EjercicioVuelos {

  
    public static void main(String[] args) {
        int vuelos [][] = new int[6][3];
        Scanner read = new Scanner (System.in);
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese la cantida de asientos para destino: " + i + "horario" + j);
                vuelos[i][j] = read.nextInt();
            }
            
        }
        
        String bandera ="";
        int destino, horario,asientos;
        while(!bandera.equalsIgnoreCase("finihs")){
            System.out.println("ingrese el numero de destino");
            destino = read.nextInt();
            
            System.out.println("ingrse el horario");
            horario = read.nextInt();
            
            System.out.println("ingrse el numero de asientos ");
            asientos = read.nextInt();
            if(destino >0 && destino<=6){
                if (horario >0 && horario<2) {
                   
            if (vuelos[destino][horario] >= asientos) {
                System.out.println("su reserva fue realizada con exito");
                vuelos[destino][horario] =vuelos[destino][horario] -asientos;
                
            }else{
                System.out.println("lo sentimos su compra no se pudo realizar con exito");
                
            }
            read.nextLine();
            System.out.println("¿desea continuar reservando? ingrese finish  para terminar");
            bandera = read.nextLine();
            
        }
        }
           
    }
    }
    
}
