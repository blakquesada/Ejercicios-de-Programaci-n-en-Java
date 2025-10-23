
package javaapplication43;


public class Programador extends Empleado{
    String lenguaje;
    
    public Programador(){
        
    }

    public Programador( String lenguaje ,String nombre , double salarioBase) {
        super(nombre , salarioBase);
        this.lenguaje = lenguaje;
    }
    
   
    @Override
    public double calcularPago(){
        if (lenguaje.equalsIgnoreCase("java")) {
            return salarioBase + 500;
        }else{
            return salarioBase;
        }
    }
    @Override
public void mostrarDatos() {
    System.out.println("Tipo: Programadr");
    System.out.println("Nombre: " + nombre);
   
}
}
