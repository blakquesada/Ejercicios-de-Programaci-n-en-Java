/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication42;


public class Empleado {
    String nombre;
    double salario;
    
    public Empleado(){
        
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void mostrarDatos(){
        System.out.println("el nombre del empleado es:"+ nombre );
        System.out.println("su salario es:" +  salario);
    }
}
