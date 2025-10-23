
package javaapplication43;


public class Contratista extends Empleado{
  
         
         double horasTrabajadas;
         double tarifaPorHora; 

    public Contratista() {
    }

    public Contratista(double horasTrabajadas, double tarifaPorHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

   
    
    
        @Override
     public double calcularPago(){
         return horasTrabajadas * tarifaPorHora;
         
    }
           @Override
public void mostrarDatos() {
    System.out.println("Tipo: contratista");
    System.out.println("Nombre: " + nombre);
 
}
    
}
