public class App {
    public static void main(String[] args) throws Exception {
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12 ";
        celularA.tamanhoTela = 6.1F;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9F;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Redmi Note 10 Pro";
        celularC.tamanhoTela = 6.6f;
        celularC.armazenamento = 128;
        celularC.sistemaOperacional = "Android";
        
        
        
        System.out.format("Celular %s com tela de %.1f polegadas, com %d gb de memoria e sistema operacional %s\n", celularA.nome, celularA.tamanhoTela, celularA.armazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f polegadas, com %d gb de memoria e sistema operacional %s\n", celularB.nome, celularB.tamanhoTela, celularB.armazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f polegadas, com %d gb de memoria e sistema operacional %s\n", celularC.nome, celularC.tamanhoTela, celularC.armazenamento, celularC.sistemaOperacional);
    }
}