
package sistemasempleados;


public class SistemasEmpleados {

  
    public static void main(String[] args) {
        
        Empleado_One primer = new Empleado_One("anibal" , "12345566" , 150000);
        
        primer.salarioTotal();
        System.out.println(primer.toString());
             System.out.println("el salario total es" + primer.salarioTotal());
        
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        Empleado_Second segundo = new Empleado_Second(1500 , 15, "anibal" , "14567890" , 18000);
        System.out.println(segundo.toString());
          System.out.println("el salario total es" + segundo.salarioTotal());
       
    }
    
}
