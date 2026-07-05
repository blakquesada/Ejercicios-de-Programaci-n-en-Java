/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author windows 11
 */
public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private  int capacidad;
    private int pasajeros;

     public Vuelo() {
    }

    public Vuelo(String codigo, String origen, String destino, int capacidad, int pasajeros) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.capacidad = capacidad;
        this.pasajeros = pasajeros;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

public boolean hayDisponibilidad(){
    return pasajeros < capacidad;

}    

public void reservarAsiento(int cantidad){

    if (cantidad + pasajeros <= capacidad) {
        
         pasajeros += cantidad;
    }else{
        System.out.println("---------error no puede reservár---------------");
    }


}

public String toString(){
   return "Código del vuelo: " + codigo +
       "\nOrigen: " + origen +
       "\nDestino: " + destino +
       "\nCapacidad: " + capacidad +
       "\nPasajeros actuales: " + pasajeros;
}


 /*String codigo;
    String origen;
    String destino;
    int capacidad;
    int pasajeros;*/



    
}
