package Estructuras.colas;

import Estructuras.listas.Nodo; 
public class Cola {
    private Nodo frente; // primer elemento
    private Nodo fin;    // último elemento

    public Cola() {
        frente = null;
        fin = null;
    }

   
    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (frente == null) {
            frente = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }


    public int dequeue() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return -1;
        }
        int dato = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) fin = null; 
        return dato;
    }

  
    public int peek() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return -1;
        }
        return frente.getDato();
    }

  
    public void recorrer() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return;
        }
        Nodo aux = frente;
        while (aux != null) {
            System.out.print(aux.getDato() + " -> ");
            aux = aux.getSiguiente();
        }
        System.out.println("null");
    }

   
    public boolean estaVacia() {
        return frente == null;
    }
}
