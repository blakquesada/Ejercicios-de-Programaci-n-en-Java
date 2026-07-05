
package javaapplication43;


public class Empleado {
    String nombre;
    double salarioBase;
    
    public Empleado(){
        
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    public double calcularPago(){
        return salarioBase;
    }
   
public void mostrarDatos() {
    System.out.println("Tipo: Empleado");
    System.out.println("Nombre: " + nombre);

}
    
}
