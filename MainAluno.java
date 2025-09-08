//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria", 101, 7.0, 8.5);
        Aluno aluno2 = new Aluno("João", 102, 5.0, 6.0);

        aluno2.notaAv1 = 7.5;

        System.out.println("=== Dados Atualizados dos Alunos ===");
        aluno1.mostrarDados();
        aluno2.mostrarDados();

        System.out.println("=== Verificação de Aprovação ===");
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
    }
}