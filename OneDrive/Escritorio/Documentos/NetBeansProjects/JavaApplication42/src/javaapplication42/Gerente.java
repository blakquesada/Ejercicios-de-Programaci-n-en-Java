
package javaapplication42;


public class Gerente extends Empleado {
    
    String departamento;
    
    public Gerente(){
        
    }

    public Gerente(String departamento,String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("su departamento es:" +  departamento);
    }
}
