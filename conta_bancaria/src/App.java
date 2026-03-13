public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria use1 = new ContaBancaria();

        use1.titular = "João";
        use1.saldo = 2934.57;

        use1.mostrarSaldo();

        use1.depositar(350);

        use1.mostrarSaldo();

        use1.sacar(50);

        use1.mostrarSaldo();
    }
}
