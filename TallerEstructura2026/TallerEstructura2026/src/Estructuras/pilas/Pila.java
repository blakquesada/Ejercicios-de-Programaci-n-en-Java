package Estructuras.pilas;

import Estructuras.listas.Nodo; 

public class Pila {
    private Nodo cima; 

    public Pila() {
        cima = null;
    }

   
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

  
    public int pop() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return -1; // valor de error
        }
        int dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }

    
    public int peek() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return -1;
        }
        return cima.getDato();
    }


    public void recorrer() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return;
        }
        Nodo aux = cima;
        while (aux != null) {
            System.out.print(aux.getDato() + " -> ");
            aux = aux.getSiguiente();
        }
        System.out.println("null");
    }

   
    public boolean estaVacia() {
        return cima == null;
    }
}
