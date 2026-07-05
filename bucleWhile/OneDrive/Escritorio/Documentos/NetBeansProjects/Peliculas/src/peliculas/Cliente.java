
package peliculas;

import java.util.Scanner;


public class Cliente {
  private  String nombre;
  private  String id;
   private String correo;

    public Cliente() {
    }

    public Cliente(String nombre, String id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }
    
    public void pedirDatos(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("ingrese su nombre");
        nombre = read.nextLine();
        
        System.out.println("ingrese su identificacion");
        id = read.nextLine();
        
        System.out.println("ingrese su correo");
        correo = read.nextLine();
        
        System.out.println("icual pelicula decea elegir 1 para deltaFORCE 2 para matrixsadf");
        int num1 = read.nextInt();
        }
    
    public String toString(){
        return "nombre:" + nombre
                + "\n identificacion" + id
                +"\n correo:" + correo;
    }
    
}
