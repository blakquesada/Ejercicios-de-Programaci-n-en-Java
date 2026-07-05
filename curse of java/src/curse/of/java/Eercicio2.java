package curse.of.java;

import java.util.Scanner;


public class Eercicio2 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        int categoria;
        double Sueldo = 0;
        
        System.out.println("ingrese su categoria");
        categoria = read.nextInt();
        
        if (categoria ==1) {  
            Sueldo = 15890 + (15890 * 010);
            
            System.out.println("su sueldo es: " + Sueldo);
        }
        else
            if (categoria ==2) {
                
                Sueldo = 25630.89;
                System.out.println("su sueldo es" + Sueldo);
                
            
        }
        else
                if (categoria==3) {
                    
                   Sueldo = 35560.20 * (0.11/100);   
                   Sueldo =  35560.20 -Sueldo;
                   
                    System.out.println("su sueldo es " + Sueldo);
        }else
                {
                    System.out.println("operacion no valida intente nuevamente");
                }
       
                    
                    
                 
            
                    
        
        
    }
    
}
