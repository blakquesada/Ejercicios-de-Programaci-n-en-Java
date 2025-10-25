
package gestionsalarios;

import java.util.Scanner;


public class GestionSalarios {
String nombre;
String cargo;
double salarioBase;
double horasTrabajadas;

public GestionSalarios(){
    
}

    public GestionSalarios(String nombre, String cargo, double salarioBase, double horasTrabajadas) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public void pedirDatos(){
        Scanner read = new Scanner (System.in);
        System.out.println("ingrese su nombre");
        nombre = read.nextLine();
        
        System.out.println("ingrese su cargo");
        cargo = read.nextLine();
        
        System.out.println("ingrese su salario");
        salarioBase = read.nextDouble();
        
        System.out.println("ingrese las horas extras trabajadas");
        horasTrabajadas = read.nextDouble();
    }
      public double calcularSalarioFinal(){
          return salarioBase += 10000;
    
}
        public String toString(){
            return "nombre:" + nombre
                    + "\n cargo:" + cargo
                    + "\nsalario:" + salarioBase
                    + "\n horas trabajadas:" + horasTrabajadas;
        }
        
        
    
    public static void main(String[] args) {
            GestionSalarios persona = new   GestionSalarios();
            persona.pedirDatos();
            System.out.println(persona.toString());
    System.out.println("salario final" + persona.calcularSalarioFinal());
    }
    
}
