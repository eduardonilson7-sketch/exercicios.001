public class Cliente {
    String nome;
    int idade;
    String email;

    public Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
        System.out.println("---------------------");
    }

    public void comprarLivro(String titulo) {
        System.out.println(nome + " comprou o livro: " + titulo);
    }
}

