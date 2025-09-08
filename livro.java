
class Livro {
    String titulo;
    String autor;
    double preco;


    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("------------------------");
    }

    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * (percentual / 100));
    }
}