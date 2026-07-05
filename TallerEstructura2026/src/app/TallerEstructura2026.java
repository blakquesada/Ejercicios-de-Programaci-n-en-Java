package app;

import java.util.Scanner;
import Estructuras.listas.ListaSimple;
import Estructuras.listas.ListaDoble;
import Estructuras.listas.ListaCircular;
import Estructuras.multilistas.Multilista;
import Estructuras.pilas.Pila;
import Estructuras.colas.Cola;

public class TallerEstructura2026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Lista Simple");
            System.out.println("2. Lista Doble");
            System.out.println("3. Lista Circular");
            System.out.println("4. Multilista");
            System.out.println("5. Pila");
            System.out.println("6. Cola");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    ListaSimple lista = new ListaSimple();
                    lista.insertarInicio(10);
                    lista.insertarFinal(20);
                    lista.insertarFinal(30);
                    lista.recorrer();
                    break;

                case 2:
                    ListaDoble lista1 = new ListaDoble();
                    lista1.insertarInicio(10);
                    lista1.insertarFinal(20);
                    lista1.insertarFinal(30);
                    lista1.recorrerAdelante();
                    lista1.recorrerAtras();
                    break;

                case 3:
                    ListaCircular lista3 = new ListaCircular();
                    lista3.insertar(10);
                    lista3.insertar(20);
                    lista3.insertar(30);
                    lista3.recorrer();
                    lista3.eliminar(20);
                    lista3.recorrer();
                    break;

                case 4:
                    Multilista ml = new Multilista();
                    ml.insertar(10);
                    ml.insertar(20);
                    ml.insertar(30);
                    ml.insertarEnSublista(20, 200);
                    ml.insertarEnSublista(20, 201);
                    ml.insertarEnSublista(30, 300);
                    ml.recorrer();
                    break;

                case 5:
                    Pila pila = new Pila();
                    pila.push(10);
                    pila.push(20);
                    pila.push(30);
                    pila.recorrer();
                    System.out.println("Pop: " + pila.pop());
                    pila.recorrer();
                    break;

                case 6:
                    Cola cola = new Cola();
                    cola.enqueue(10);
                    cola.enqueue(20);
                    cola.enqueue(30);
                    cola.recorrer();
                    System.out.println("Dequeue: " + cola.dequeue());
                    cola.recorrer();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while(opcion != 7);
    }
}
