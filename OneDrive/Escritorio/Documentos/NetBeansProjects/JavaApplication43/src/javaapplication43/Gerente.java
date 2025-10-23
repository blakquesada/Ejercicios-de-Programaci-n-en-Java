
package javaapplication43;


public class Gerente extends Empleado{
    String departamento;
    
    
    public Gerente(){
        
    }
    
    
    public Gerente(String departamento, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.departamento = departamento;
    }
    
    @Override
     public double calcularPago(){
        return salarioBase * 0.10;
    }
     
     @Override
public void mostrarDatos() {
    System.out.println("Tipo: Gerente");
    System.out.println("Nombre: " + nombre);
    System.out.println("Salario mensual: $" + calcularPago());
}
    
    
    
    
    
    
}
