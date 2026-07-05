
package sistemaventasunicolombo;


public class SistemaVentasUnicolombo {


    public static void main(String[] args) {
        
        Producto producto = new Producto("jabon" , 3500, 100);
        Cliente cliente = new Cliente("anibal", "1098936398");
       System.out.println(  cliente.toString());
        System.out.println( producto.toString());
        
        
        producto.Vender(80);
        System.out.println(producto.toString());
        
        

    }
    
}
