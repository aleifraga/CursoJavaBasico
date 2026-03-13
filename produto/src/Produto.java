public class Produto {

    //atributos
    String nome;
    double preco;
    int quantidade;

    public void mostrarProduto(){
        System.out.println("Nome Produto: " + nome + " - R$" + preco + " - Quant.: " + quantidade);
    }

    public void valorTotal(){
        double conta = quantidade * preco;
        System.out.println("Valor total: R$" + conta);
    }    
}
