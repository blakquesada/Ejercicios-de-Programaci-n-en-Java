package curse.of.java;


import java.util.Scanner;



public class Swith {

    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
       
        String n;
        int operacion = 3;
        
        System.out.println("ingrese la operacion ");
        operacion = read.nextInt();
        
        switch (operacion){
        
        case 1: 
            System.out.println("haz elegido sumar");
            int num1 , num2, resul;
            
            System.out.println("ingrese el numero1");
            num1  = read.nextInt();
            
            System.out.println("ingrese el numero2");
            num2  = read.nextInt();
            
            resul = num1 + num2;
            System.out.println("el resultado de la suma es:" + resul );
        break;
        
        case 2: ;
         System.out.println("haz elegido restar");
           
            
            System.out.println("ingrese el numero1");
            num1  = read.nextInt();
            
            System.out.println("ingrese el numero2");
            num2  = read.nextInt();
            
            resul = num1 - num2;
            System.out.println("el resultado de la resta es:" + resul );
        break;
        
        case 3:;
            System.out.println("saliendo del programa");
            break;
        default : System.out.println("numero ingresado no valido");
    }
    }
    
}
