

package com.mycompany.ejercicio1;


public class Ejercicio1 {

    public static void main(String[] args) {
       int num1,num2,aux;
       
       num1 = 25;
       num2 = 30;
       
        System.out.println("========antes========");
        
        System.out.println("num1 vale:"+ num1);
        System.out.println("num1 vale:"+ num2);
    
        System.out.println("========despues=======");
        aux = num1;
        num1 = num2;
        num2 = aux;
        
        System.out.println("num1 vale:"+ num1);
        System.out.println("num1 vale:"+ num2);
        
        
                
    }   
}
