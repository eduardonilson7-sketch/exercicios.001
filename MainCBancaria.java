//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("02256", "Maria", 550.0);
        ContaBancaria conta2 = new ContaBancaria("05418", "João", 1030.0);

        System.out.println("=== Operações Conta 1 ===");
        conta1.consultarSaldo();
        conta1.depositar(200);
        conta1.sacar(100);
        conta1.consultarSaldo();

        System.out.println("\n=== Operações Conta 2 ===");
        conta2.consultarSaldo();
        conta2.sacar(1500); // saldo insuficiente
        conta2.depositar(300);
        conta2.sacar(200);
        conta2.consultarSaldo();
    }
}