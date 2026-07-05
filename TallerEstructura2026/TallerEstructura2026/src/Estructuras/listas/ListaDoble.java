
package Estructuras.listas;

               
public class ListaDoble {
    private NodoDoble inicio;
    private NodoDoble fin;

    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    
    public void insertarInicio(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    
    public void insertarFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (fin == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }

    
    public void eliminarInicio() {
        if (inicio != null) {
            inicio = inicio.getSiguiente();
            if (inicio != null) inicio.setAnterior(null);
            else fin = null;
        }
    }

    
    public void eliminarFinal() {
        if (fin != null) {
            fin = fin.getAnterior();
            if (fin != null) fin.setSiguiente(null);
            else inicio = null;
        }
    }

  
    public void recorrerAdelante() {
        NodoDoble aux = inicio;
        while (aux != null) {
            System.out.print(aux.getDato() + " <-> ");
            aux = aux.getSiguiente();
        }
        System.out.println("null");
    }

    
    public void recorrerAtras() {
        NodoDoble aux = fin;
        while (aux != null) {
            System.out.print(aux.getDato() + " <-> ");
            aux = aux.getAnterior();
        }
        System.out.println("null");
    }
}

