
package Estructuras.listas;



public class ListaCircular {
    private Nodo inicio;

    public ListaCircular() {
        inicio = null;
    }

    
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
            inicio.setSiguiente(inicio); 
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != inicio) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }
    }


    public void eliminar(int dato) {
        if (inicio == null) return;

        Nodo actual = inicio;
        Nodo anterior = null;

        do {
            if (actual.getDato() == dato) {
                if (anterior == null) { // eliminar inicio
                    Nodo aux = inicio;
                    while (aux.getSiguiente() != inicio) {
                        aux = aux.getSiguiente();
                    }
                    if (inicio == inicio.getSiguiente()) {
                        inicio = null; // solo un nodo
                    } else {
                        aux.setSiguiente(inicio.getSiguiente());
                        inicio = inicio.getSiguiente();
                    }
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        } while (actual != inicio);
    }

   
    public void recorrer() {
        if (inicio == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo aux = inicio;
        do {
            System.out.print(aux.getDato() + " -> ");
            aux = aux.getSiguiente();
        } while (aux != inicio);
        System.out.println("(regresa al inicio)");
    }
}
