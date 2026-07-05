
package estudiante;

import java.util.Scanner;


public class Estudiante {
String nombre;
String codigo;
double nota1;
double nota2;
double nota3;

    public Estudiante() {
    }

    public Estudiante(String nombre, String codigo, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

public double Promedio(double promedio){
    
    promedio = (nota1 + nota2 + nota3)/3;
    
    System.out.println(" su promedio es " + promedio);
    
    return promedio;
}

public String toString(){
    return "estudiante:" + nombre
            + "codigo:" + codigo;
         
}

public void pedirDatos() {
    Scanner read = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese nombre (o 'fin' para terminar): ");
        String nombre = read.nextLine();

        if (nombre.equalsIgnoreCase("fin")) {
            break;
        }

        System.out.print("Ingrese su código estudiantil: ");
        String codigo = read.nextLine();

        System.out.print("Ingrese su nota N°1: ");
        double nota1 = read.nextDouble();

        System.out.print("Ingrese su nota N°2: ");
        double nota2 = read.nextDouble();

        System.out.print("Ingrese su nota N°3: ");
        double nota3 = read.nextDouble();
        read.nextLine(); // limpiar el buffer

        Estudiante e = new Estudiante(nombre, codigo, nota1, nota2, nota3);

        System.out.println(e.toString());
        e.Promedio(0); // sin parámetro
    }
}public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
         
        estudiante.pedirDatos();
         System.out.println(estudiante.toString());
         
         estudiante.Promedio(0);
    }
    
}
