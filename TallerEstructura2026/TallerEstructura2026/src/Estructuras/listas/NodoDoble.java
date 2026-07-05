/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras.listas;

/**
 *
 * @author windows 11
 */
public class NodoDoble {
    private int dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;
    
    
public NodoDoble (int dato){
    this.dato = dato;
    this.siguiente = null; // por que siguiente es nul/
    this.anterior= null;  // por que anterior es null
    
      
}    

public int getDato(){
    return dato;
}

public void serDato(int dato){
    this.dato = dato;
}

public NodoDoble getSiguiente(){
 return siguiente;    
}

public void setSiguiente(NodoDoble siguiente){
    this.siguiente = siguiente;
}

public NodoDoble getAnterior(){
    return anterior;            
}

public void setAnterior (NodoDoble anterior){
    this.anterior = anterior;
}


}
