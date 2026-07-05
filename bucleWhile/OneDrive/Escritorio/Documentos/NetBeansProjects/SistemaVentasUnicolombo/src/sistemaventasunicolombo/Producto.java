
package sistemaventasunicolombo;


public class Producto {
    String nombre;
    double precio;
   int  cantidadDisponible;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public int Vender(int cantidad){
        if (cantidad <= cantidadDisponible) {
            
            cantidadDisponible -= cantidad;

        }else{
            System.out.println("-------error no suficiente inventario");
        }
        return cantidad;
    }
    
    public String toString(){
        return "producto:" + nombre
                + "\n precio:" + precio
                + "\n stock disponible:" + cantidadDisponible;
    }
   
   
    
}
