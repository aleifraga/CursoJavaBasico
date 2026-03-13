public class ContaBancaria {
    String titular;
    double saldo;
    
    
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }

    
    public void sacar(double saque){
        saldo = saldo - saque;
    }

    public void mostrarSaldo(){
        System.out.println("Titular: " + titular + "    Saldo: " + saldo);
    }
}
