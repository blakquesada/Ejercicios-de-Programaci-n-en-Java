
package Estructuras.listas;


public class ListaSimple {
    private Nodo inicio;

    public ListaSimple() {
        inicio = null;
    }

    
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }

 
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

   
    public void insertarDespuesDe(int referencia, int dato) {
        Nodo aux = inicio;
        while (aux != null && aux.getDato() != referencia) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            Nodo nuevo = new Nodo(dato);
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

   
    public void eliminarInicio() {
        if (inicio != null) {
            inicio = inicio.getSiguiente();
        }
    }

 
    public void eliminarFinal() {
        if (inicio == null) return;
        if (inicio.getSiguiente() == null) {
            inicio = null;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
    }

   
    public void eliminarPorDato(int dato) {
        if (inicio == null) return;
        if (inicio.getDato() == dato) {
            inicio = inicio.getSiguiente();
            return;
        }
        Nodo aux = inicio;
        while (aux.getSiguiente() != null && aux.getSiguiente().getDato() != dato) {
            aux = aux.getSiguiente();
        }
        if (aux.getSiguiente() != null) {
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
    }

   
    public Nodo buscar(int dato) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getDato() == dato) return aux;
            aux = aux.getSiguiente();
        }
        return null;
    }

    
    public void recorrer() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.getDato() + " -> ");
            aux = aux.getSiguiente();
        }
        System.out.println("null");
    }

    
    public void ordenarSeleccion() {
        for (Nodo i = inicio; i != null; i = i.getSiguiente()) {
            Nodo menor = i;
            for (Nodo j = i.getSiguiente(); j != null; j = j.getSiguiente()) {
                if (j.getDato() < menor.getDato()) {
                    menor = j;
                }
            }
              int temp = i.getDato();
            i.setDato(menor.getDato());
            menor.setDato(temp);
        }
    }

    // ✅ Invertir lista
    public void invertir() {
        Nodo anterior = null;
        Nodo actual = inicio;
        Nodo siguiente;
        while (actual != null) {
            siguiente = actual.getSiguiente();
            actual.setSiguiente(anterior);
            anterior = actual;
            actual = siguiente;
        }
        inicio = anterior;
    }
    
}
