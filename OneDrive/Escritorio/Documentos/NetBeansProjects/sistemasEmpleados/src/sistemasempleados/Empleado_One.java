
package sistemasempleados;


public class Empleado_One {
    String nombre;
    String identificacion;
    double salarioBase;
    
    
    public Empleado_One(){
        
    }

    public Empleado_One(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }
    
        
     public double salarioTotal(){
        return salarioBase; 
    }
    
   public  String toString(){
       return "nombre:" + nombre
               + "\n dentificacion:" + identificacion
               +  "\n salario base:"+salarioBase;
                
       
       
   }
}
