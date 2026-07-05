/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.ArrayList;

/**
 *
 * @author windows 11
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Aerolinea avianca = new  Aerolinea();
      avianca.setNombre("avianca");
      avianca.setPais("bogota");
      avianca.setListavuelo(new ArrayList<>());

      
      Vuelo v1 = new Vuelo("AV123", "Bogotá", "Madrid", 300, 150);
      Vuelo v2 = new Vuelo("AV456", "Cartagena", "Miami", 200, 180);
      Vuelo v3 = new Vuelo("AV789", "Medellín", "Panamá", 120, 100);
      
      avianca.agregarVuelo(v1);
      avianca.agregarVuelo(v2);
      avianca.agregarVuelo(v3);
      
      System.out.println("Vuelos disponibles:");
      avianca.mostrarVuelos(); 
      
      Vuelo vueloBuscado = avianca.buscarVuelo("AV456");

     if (vueloBuscado != null) {
    vueloBuscado.reservarAsiento(50);
        } else {
        System.out.println("Vuelo no encontrado.");
        
        System.out.println("Total de pasajeros en la aerolínea: " + avianca.totalPasajeros());

}

  


    }
    
}
