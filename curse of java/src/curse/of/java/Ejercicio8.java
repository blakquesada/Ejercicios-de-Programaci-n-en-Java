
package curse.of.java;

import java.util.Scanner;


public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        
        String ciudades[] = new String[5]; 
        double minima[] = new double[5];
        double maxima [] = new double[5];
        
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("ingrese la ciudad:" + i);
            ciudades[i] = read.nextLine();
            
            System.out.println("ingrese la temperatura minima:" + i);
            minima[i] = read2.nextDouble();
            
            System.out.println("imgrese la temperatura maxima:" + i);
            maxima[i] = read2.nextDouble(); 
             
        }
        
        double mini = 99999.00;
         double maxi = -99999.00;
         int posmin=-1;
         int posmax=-1;
        for (int i = 0; i < ciudades.length; i++) {
            
            if (minima[i] < mini) {
                mini = minima[i];
                posmin = i;
                
            }
                if (maxima[i] > maxi) {
                    maxi = maxima[i];
                posmax = i;
            }
            
        }
        System.out.println("la temperatura minima es de:" + mini);
            System.out.println("se regidtro en la ciudad de:" + ciudades[posmin]);
          System.out.println("la temperatura maxima es de:" + maxi);
            System.out.println("se regidtro en la ciudad de:" + ciudades[posmax]);
        
    }
    
}