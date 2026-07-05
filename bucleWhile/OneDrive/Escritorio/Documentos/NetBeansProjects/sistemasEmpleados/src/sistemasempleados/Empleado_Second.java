
package sistemasempleados;


public class Empleado_Second extends Empleado_One {
    double porcentajeComicion;
    double ventasRealizadas;
    
    public Empleado_Second (){
        
    }

    public Empleado_Second( double porcentajeComicion , double ventasRealizadas , String nombre, String identificacion, double salarioBase) {
        super(nombre, identificacion, salarioBase);
        this.porcentajeComicion = porcentajeComicion;
        this.ventasRealizadas = ventasRealizadas;
    }
    
    @Override
    public double salarioTotal(){
        return ventasRealizadas+ porcentajeComicion;
    }
    
    
    @Override
     public  String toString(){
       return "nombre:" + nombre
               + "\n dentificacion:" + identificacion
               +  "\n salario base:"+salarioBase;
       
       
    
    
}
}
