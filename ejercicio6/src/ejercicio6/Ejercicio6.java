
package ejercicio6;


public class Ejercicio6 {

    
    public static void main(String[] args) {
        //declarar altura del arbol
        int altura =12;
        //bucle para recorrer todas las filas (altura)
        for (int fila = 0; fila < altura; fila++) {
            
            //bucle para los espacios
            for (int espacio = 0; espacio < (altura-fila-1); espacio++) {
                System.out.print(" ");
            }
            
            //for asteriscos 
            for (int asteriscos = 0; asteriscos < (fila*2+1); asteriscos++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
          
                
            }
            
            //
                  int largoTronco = 1;
            for (int base  = 0; base < largoTronco; base++) {
                
                for (int espacio = 0; espacio < altura-2; espacio++) {
                    System.out.print(" ");
                }
                
                for (int tronco = 0; tronco < 3; tronco++) {
                    System.out.print("|");
                    
                }
      
    }
    
}
}