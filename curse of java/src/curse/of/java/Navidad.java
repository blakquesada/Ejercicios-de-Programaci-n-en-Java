
package curse.of.java;


public class Navidad {

   
    public static void main(String[] args) {
        
        int altura = 10;
        
        //altura del arbolito
        for (int fila = 0; fila < altura; fila++) {
            //ciclo para los espacios
            for (int espacio = 0; espacio < (altura-fila-1); espacio++) {
                System.out.print(" ");
                
             
            }
               //ciclo para los asteriscos
                for (int asteriscos = 0; asteriscos < (fila*2)+1; asteriscos++) {
                     System.out.print("*");           
                }
                     
                System.out.println("");
            
        }
        //Tronco
        int largoTronco=1;
        for (int base = 0; base < largoTronco; base++) {
            // espacios
            for (int espacio = 0; espacio < (altura-2); espacio++) {
                        System.out.print(" ");
        }    //barritas tronco
            for (int Tronco = 0; Tronco < 3; Tronco++) {
                System.out.print("|");
                
            }
            System.out.println(" ");
        }
        
        
    }
                     
}