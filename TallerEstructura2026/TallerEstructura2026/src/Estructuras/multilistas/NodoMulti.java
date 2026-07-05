
package Estructuras.multilistas;


public class NodoMulti {
    private int dato;
    private NodoMulti siguiente;
    private NodoMulti sublista; // referencia a otra lista

    public NodoMulti(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.sublista = null;
    }

    public int getDato() { 
        return dato; 
    }
    public void setDato(int dato) { 
        this.dato = dato; 
    }

    public NodoMulti getSiguiente() { 
        return siguiente; 
    }
    
    public void setSiguiente(NodoMulti siguiente) { 
        this.siguiente = siguiente; 
    }

    public NodoMulti getSublista() { return sublista; }
    public void setSublista(NodoMulti sublista) { this.sublista = sublista; }
}
