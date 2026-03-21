import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();

        System.out.format("O aluno %s tem a nota: %.2f%n", nome, nota);

        teclado.close();
    }
}