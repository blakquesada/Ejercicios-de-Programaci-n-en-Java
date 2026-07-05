package Estructuras.multilistas;

public class Multilista {
    private NodoMulti inicio;

    public Multilista() {
        inicio = null;
    }

    // ✅ Inserción en la multilista (al final de la lista principal)
    public void insertar(int dato) {
        NodoMulti nuevo = new NodoMulti(dato);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            NodoMulti aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    // ✅ Inserción en una sublista de un nodo específico
    public void insertarEnSublista(int referencia, int dato) {
        NodoMulti aux = inicio;
        while (aux != null && aux.getDato() != referencia) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            NodoMulti nuevo = new NodoMulti(dato);
            if (aux.getSublista() == null) {
                aux.setSublista(nuevo);
            } else {
                NodoMulti sub = aux.getSublista();
                while (sub.getSiguiente() != null) {
                    sub = sub.getSiguiente();
                }
                sub.setSiguiente(nuevo);
            }
        }
    }

    // ✅ Eliminación por dato en la lista principal
    public void eliminar(int dato) {
        if (inicio == null) return;
        if (inicio.getDato() == dato) {
            inicio = inicio.getSiguiente();
            return;
        }
        NodoMulti aux = inicio;
        while (aux.getSiguiente() != null && aux.getSiguiente().getDato() != dato) {
            aux = aux.getSiguiente();
        }
        if (aux.getSiguiente() != null) {
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
    }

    // ✅ Recorrer multilista
    public void recorrer() {
        NodoMulti aux = inicio;
        while (aux != null) {
            System.out.print(aux.getDato() + " -> ");
            // recorrer sublista si existe
            if (aux.getSublista() != null) {
                NodoMulti sub = aux.getSublista();
                System.out.print("[");
                while (sub != null) {
                    System.out.print(sub.getDato() + " ");
                    sub = sub.getSiguiente();
                }
                System.out.print("] ");
            }
            aux = aux.getSiguiente();
        }
        System.out.println("null");
    }
}
