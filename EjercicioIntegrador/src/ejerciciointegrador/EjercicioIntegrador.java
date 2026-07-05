
package ejerciciointegrador;

import java.util.Scanner;


public class EjercicioIntegrador {

    
    public static void main(String[] args) {
        
        int categoria ;
        double sueldo=0;
                
        Scanner read = new Scanner (System.in);
        System.out.println("ingrese la categoria");
        categoria = read.nextInt();
        
        if (categoria==1) {
           
            sueldo = 15890 +( 15890*0.10);
          
        }else if (categoria==2) {
            sueldo =25630.89;
            
        }else if (categoria==3) {
            sueldo =35560.20;
            sueldo = 35560.20 -( 35560.20*0.10);
               
        }else{
            System.out.println("categoria no encontrada");
        }
        
        System.out.println("su sueldo es :"+sueldo);
        
        
        
    }
    
}
