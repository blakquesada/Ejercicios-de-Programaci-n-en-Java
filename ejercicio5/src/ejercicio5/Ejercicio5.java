
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

 
    public static void main(String[] args) {
    
        Scanner read = new Scanner (System.in);
        
        System.out.println("ingrese su nombre");
        String nombre = read.next();
        
        System.out.println("ingrese su dni");
        int dni = read.nextInt();
        
        System.out.println("ingrese su edad");
        int edad = read.nextInt();
        
        while(dni!=0 || !nombre.equalsIgnoreCase("fin")){
            
            if (edad <=0) {
                System.out.println("numero debe ser mayor a cero");
                
            }else if (edad >=6 &&edad <=10) {
                System.out.println("su categoria es Menores A");
            }else if (edad >=11 && edad<=17) {
                System.out.println("su categoria es MENORES B");
                
            }else if (edad >=18 && edad <=30) {
                System.out.println("su categoria pertenece a JUVENILES ");
            
            }else if (edad >=31&& edad <=50) {
                System.out.println("su categoria pertenece a MAYORES");
            }  else{
                System.out.println("adultos mayores");
            }
            
            
            
            System.out.println("ingrese su nombre");
         nombre = read.next();
        
        System.out.println("ingrese su dni");
         dni = read.nextInt();
        
        System.out.println("ingrese su edad");
         edad = read.nextInt();
            
        }
            
    
    }
    
}
