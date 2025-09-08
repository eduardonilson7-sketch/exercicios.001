//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 120.00);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 45.00);

        livro1.preco = 100.00; // alterando preço do livro1
        livro2.titulo = "Memórias Póstumas de Brás Cubas"; // alterando título do livro2

        System.out.println("Informações dos livros:");
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();

        System.out.println("Aplicando desconto de 10% no Livro 1...");
        livro1.aplicarDesconto(10);

        System.out.println("Novo preço do Livro 1:");
        livro1.exibirInformacoes();
    }
}

