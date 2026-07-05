
package javaapplication43;
import java.util.ArrayList;

public class sistemaEmpresa {


    public static void main(String[] args) {
        ArrayList<Empleado>  Empleados = new ArrayList<>();
        
        Empleados.add(new Empleado("anibal" , 15000));
        Empleados.add(new Programador ("java" , "anibal" , 16000 ));
        Empleados.add(new Gerente("administrativo" , "quesada" , 25000));
        Empleados.add(new Contratista(8 , 180, "mateo" , 18000 ));
        
        for (Empleado e: Empleados) {
            System.out.println("Empleado: "+e.nombre);
            e.mostrarDatos();
            System.out.println("salario mensual: "+e.calcularPago());
            System.out.println("----------------------------------------------------------------------");
            
        }
        
        double nominaTotal =0;
        for (Empleado e: Empleados) {
            nominaTotal += e.calcularPago();               
        }
       System.out.println("la nomina es" + nominaTotal);

    }
    
}
