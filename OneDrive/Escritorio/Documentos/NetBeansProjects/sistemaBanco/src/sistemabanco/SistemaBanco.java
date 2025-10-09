
package sistemabanco;
import java.util.ArrayList;
 class SistemaBanco {

 
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Unisinu",  new ArrayList<cuentaBancaria>());

        cuentaBancaria c1 = new cuentaBancaria("001", "Aníbal", 5000);
        cuentaBancaria c2 = new cuentaBancaria("002", "Laura", 3000);
        cuentaBancaria c3 = new cuentaBancaria("003", "Carlos", 7000);

        banco.agregarCuentas(c1);
        banco.agregarCuentas(c2);
        banco.agregarCuentas(c3);

        c1.depositar(1500);      // Aníbal deposita
        c2.retirar(500);         // Laura retira
        c3.transferir(c1, 2000); // Carlos transfiere a Aníbal

        System.out.println("\n📋 Saldo final de todas las cuentas:");
        banco.totalDinero();

        System.out.println("\n💰 Total dinero en el banco: $" + banco.totalDinero());

    }
    
}
