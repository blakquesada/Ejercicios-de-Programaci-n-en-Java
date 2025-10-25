
package vehiculo;

import java.util.Scanner;


public class Vehiculo {
String marca;
String modelo;
int año;
double precio;
String tipoCombustible;

public Vehiculo(){
    
}

    public Vehiculo(String marca, String modelo, int año, double precio, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

public double calcularImpuesto(){
    if (tipoCombustible.equalsIgnoreCase("gasolina")) {
          return precio *0.5;
        
    }else
        if (tipoCombustible.equalsIgnoreCase("diesel")) {
            return precio * 0.8;
        
    }else
            if (tipoCombustible.equalsIgnoreCase("electrico")) {
                return precio * 0.2;
        
    }
    return precio;
}
 public String toString(){
     return "marca" + marca
            + "\n modelo:" + modelo
                     + "\n año:" + año
                     + "\n precio"+ precio
                             + "\n tipo de conbustible";
 }
 
 public void pedirDatos(){
     Scanner read = new Scanner(System.in);
     System.out.println("ingrese la marca del vehiculo");
     marca = read.nextLine();
     
     System.out.println("ingrese el modelo del vehiculo:");
     modelo = read.nextLine();
     
     System.out.println("ingrese el año del vehiculo");
     año = read.nextInt();
     
     System.out.println("ingrese el precio");
     precio = read.nextDouble();
       read = new Scanner(System.in);
     System.out.println("ingrese el tipo de conbustible ");
     tipoCombustible = read.nextLine();
 }
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo();
        
        carro.pedirDatos();
        System.out.println(carro.toString());
        carro.calcularImpuesto();
        System.out.println(carro.calcularImpuesto());
        

    }
    
}
