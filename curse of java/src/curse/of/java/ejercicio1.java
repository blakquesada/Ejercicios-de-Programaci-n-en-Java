
package curse.of.java;


public class ejercicio1 {

   
    public static void main(String[] args) {
        
        System.out.println("==antes==");
        int numero1, numero2, aux;
        
        numero1 = 35;
        numero2 = 20;
        
        System.out.println("numero1 tiene el valor de:" + numero1);
        System.out.println("numero2 tiene el valor de:"+ numero2);
        
        System.out.println("==== despues====");
        aux = numero1;
        numero1 = numero2;
        numero2 = aux;
        
        System.out.println("numero1 tiene el valor de:" + numero1);
        System.out.println("numero2 tiene el valor de:"+ numero2);
    }
    
}
