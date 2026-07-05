
package sistemaventasunicolombo;


public class Cliente {
    String nombre;
    String id;

    public Cliente() {
    }

    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public String toString(){
        return "nombre:" + nombre
                + "\n identificacion:" + id;
        
    }
    
}







/*Sistema de Ventas de Tienda
La Fundación Universitaria Unicolombo requiere el desarrollo de una aplicación en Java basada en los principios de Programación Orientada a Objetos (POO), con el objetivo de simular el funcionamiento básico de una tienda llamada “Unicolombo Market”.
El sistema debe permitir registrar productos, clientes y realizar ventas, verificando la disponibilidad del inventario. El ejercicio se realizará sin encapsulamiento, es decir, los atributos podrán ser accedidos directamente desde el programa principal.
Requerimientos del ejercicio
Se solicita crear las siguientes clases:
Clase Producto
Debe contener los siguientes elementos:
•	Atributos:
1.	nombre (String): nombre del producto.
2.	precio (double): valor unitario del producto.
3.	cantidadDisponible (int): cantidad existente en inventario.
•	Métodos requeridos:
1.	Constructor: que permita asignar los valores iniciales a los atributos.
2.	vender(int cantidad): debe reducir la cantidad disponible si hay suficiente inventario y mostrar el valor total de la venta. En caso de no haber suficientes unidades, debe mostrar un mensaje de error.
3.	toString(): que devuelva un texto con la información completa del producto (nombre, precio y stock disponible).
Clase Cliente
Debe contener los siguientes elementos:
•	Atributos:
1.	nombre (String): nombre del cliente.
2.	id (String): número de identificación.
•	Métodos requeridos:
1.	Constructor: que permita asignar los valores iniciales.
2.	toString(): que muestre el nombre e identificación del cliente.
Clase Main
El programa principal debe:
•	Crear al menos un objeto de tipo Producto y un objeto de tipo Cliente.
•	Mostrar la información de ambos usando el método toString().
•	Realizar una venta indicando la cantidad deseada.
•	Validar si existe suficiente stock.
•	Mostrar el total de la venta y la cantidad restante del producto después de la transacción.
2.EJERCICIO
sistema de Registro de Estudiantes – “Unicolombo Academy”
La Fundación Universitaria Unicolombo necesita un programa en Java que permita registrar la información básica de un estudiante y calcular su promedio final de notas.
El sistema debe solicitar los datos desde el teclado y mostrar el resultado en pantalla.
El ejercicio debe aplicarse utilizando Programación Orientada a Objetos (POO) sin aplicar encapsulamiento (los atributos pueden ser accedidos directamente).
Requerimientos del sistema
Se deben crear las siguientes clases:
Clase Estudiante
Atributos:
•	nombre (String): nombre del estudiante.
•	codigo (String): código o identificación del estudiante.
•	nota1 (double): primera nota.
•	nota2 (double): segunda nota.
•	nota3 (double): tercera nota.
Métodos:
•	Constructor: inicializa los atributos.
•	calcularPromedio(): calcula y muestra el promedio de las tres notas.
•	toString(): muestra el nombre, el código y el promedio final.

Clase Main
El programa principal debe:
•	Solicitar al usuario los datos del estudiante y sus tres notas.
•	Crear un objeto de tipo Estudiante.
•	Calcular y mostrar el promedio.
•	Mostrar toda la información del estudiante usando el método toString().*/
    
