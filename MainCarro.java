//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2021);

        carro1.marca = "Chevrolet";
        carro1.modelo = "Onix";
        carro1.ano = 2022;

        System.out.println("=== Informações dos Carros ===");
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();


        carro1.ligarCarro();
        carro2.ligarCarro();
    }
}