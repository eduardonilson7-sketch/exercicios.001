//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana", 25, "ana@email.com");
        Cliente cliente2 = new Cliente("Carlos", 32, "carlos@email.com");

        cliente1.exibirDados();
        cliente2.exibirDados();

        cliente1.comprarLivro("O Senhor dos Anéis");
        cliente2.comprarLivro("Dom Casmurro");
    }
}