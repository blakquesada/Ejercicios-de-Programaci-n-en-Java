
package sistemabanco;


public class cuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;

    public cuentaBancaria() {
    }

    public cuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void depositar(double monto){
        if (monto<saldo) {
            saldo +=monto;
        }else{
            System.out.println("no puede ingresar un monto negativo");
        }
        
    }
    
     public void retirar(double monto){
        if (monto<=saldo) {
            saldo -=monto;
        }else{
            System.out.println("no puede retirar");
            
            
        }
        
    }
     
     public void transferir(cuentaBancaria destino, double monto){
        if (monto<=saldo) {
            saldo -=monto;
            destino.depositar(monto);
        }else{
            System.out.println("transferencia invalida");
           
}
        
     }
     
     public String toString(){
         return "nombre:" + titular
                 + "\n numero de cuenta:" + numeroCuenta
                 + "\n saldo:" +  saldo; 
     }
     
}
