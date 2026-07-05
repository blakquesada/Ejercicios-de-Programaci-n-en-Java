
package sistemabanco;
import java.util.ArrayList;

public class Banco {
    String nombre;
    ArrayList<cuentaBancaria> cuentas;

    public Banco() {
    }

    public Banco(String nombre, ArrayList<cuentaBancaria> cuentas) {
        this.nombre = nombre;
        this.cuentas = cuentas;
    }
    
    public void agregarCuentas(cuentaBancaria c){
        cuentas.add(c);
        
    }
    
    public cuentaBancaria buscarCuenta(String numero){
        for (cuentaBancaria c: cuentas) {
            if (c.numeroCuenta.equals(numero)) {
               return c;
            }
           
        }
          return null;
    }

    public void mostrar(String numero){
        for (cuentaBancaria c: cuentas) {
            System.out.println(c);
           
        }
         
    }
    
    public int totalDinero(){
        int total =0;
        
        for (cuentaBancaria c: cuentas) {
            total +=c.saldo;
            
        }
        return total;
    }
}
