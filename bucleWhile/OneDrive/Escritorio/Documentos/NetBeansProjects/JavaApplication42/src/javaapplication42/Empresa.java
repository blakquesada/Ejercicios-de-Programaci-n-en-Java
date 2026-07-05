
package javaapplication42;


public class Empresa {

  
    public static void main(String[] args) {
        Empleado em = new Empleado("anibal" , 15000);
        Gerente ge = new Gerente ("departamento", "anibal" , 15000);
        
        em.mostrarDatos();
        ge.mostrarDatos();
      
    }
    
}
