
package citiestemperature;

import java.util.Scanner;


public class CitiesTemperature {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        String citiesName [] = new String [5];
        double temperatureMax[] =new double[5];
        double temperaturemin[] =new double[5];
       
        for (int i = 0; i < citiesName.length; i++) {
            System.out.println("enter the city name");
            citiesName[i] = read.next();
            
            System.out.println("enter the temperature max");
            temperatureMax[i] = read.nextDouble();
            
             System.out.println("enter the temperature min");
            temperaturemin[i] = read.nextDouble();
            
        }
        int posMin =-1 ;
        double minima = 99999.00;
        for (int i = 0; i < citiesName.length; i++) {
            if (temperaturemin[i] < minima) {
                minima =temperaturemin[i];
                posMin = i;
                
            }
            
        }
        double maxima = -99999.00;
        int posMax =-1 ;
         for (int i = 0; i < citiesName.length; i++) {
            if (temperatureMax[i] > maxima) {
                maxima =temperatureMax[i];
                posMax= i;
                
            }
            
      
}
      System.out.println("La temperatura minima es de: " + minima);
             System.out.println("se registro en la ciudad de:" + citiesName[posMin]);
              System.out.println("La temperatura maxima es de: " +maxima);
             System.out.println("se registro en la ciudad de:" + citiesName[posMax]);  
}
    }
