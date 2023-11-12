public class App {
    public static void main(String[] args) throws Exception {
       // Samsung Galaxy a32, tela de 6.9", 256gb
       // Iphone 13, tela de 6.4", de 256gb
       // Xiaomi Mi 11 Pro, tela de 6.81", de 128gb

       // Declarando um objeto do tipo celular
      Celular celularA = new Celular();
      celularA.nome = "Samsung Galaxy 32";
      celularA.tamanhoTela = 6.9f;
      celularA.espacoArmazenamento = 256;
      celularA.sistemaOperacional = "Android";

      Celular celularB = new Celular();
      celularB.nome = "Iphone 13";
      celularB.tamanhoTela = 6.4f;
      celularB.espacoArmazenamento = 256;
      celularB.sistemaOperacional = "IOS";

      Celular celularC = new Celular();
      celularC.nome = "Xiaomi Mi 11 Pro";
      celularC.tamanhoTela = 6.81f;
      celularC.espacoArmazenamento = 128;
      celularC.sistemaOperacional = "Android";
    
    
    

      System.out.format("Celular %s com tela de %.1f com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
      System.out.format("Celular %s com tela de %.1f com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
      System.out.format("Celular %s com tela de %.1f com %dgb e SO %s", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
    }
}
