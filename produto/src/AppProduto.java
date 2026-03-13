public class AppProduto {
    public static void main(String[] args){
        
        Produto p1 = new Produto();
        p1.nome = ("Notebook");
        p1.preco = 3400.90;
        p1.quantidade = 3;

        p1.mostrarProduto();
        p1.valorTotal();



    }
}