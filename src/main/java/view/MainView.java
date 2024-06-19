package view;
import controller.CofrinhoController;
import java.util.Scanner;

public class MainView {
    private CofrinhoController controller;
    private Scanner scanner;

    public MainView(CofrinhoController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            System.out.println("1. Adicionar Moeda");
            System.out.println("2. Listar Moedas");
            System.out.println("3. Calcular Total em Reais");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    adicionarMoeda();
                    break;
                case 2:
                    controller.listarMoedas();
                    break;
                case 3:
                    System.out.println("Total em Reais: " + controller.calcularTotalEmReais());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void adicionarMoeda() {
        System.out.println("Escolha a moeda:");
        System.out.println("1. Dolar");
        System.out.println("2. Euro");
        System.out.println("3. Real");

        int tipo = scanner.nextInt();
        System.out.println("Digite o valor:");
        double valor = scanner.nextDouble();

        switch (tipo) {
            case 1:
                controller.adicionarDolar(valor);
                break;
            case 2:
                controller.adicionarEuro(valor);
                break;
            case 3:
                controller.adicionarReal(valor);
                break;
            default:
                System.out.println("Tipo inválido.");
        }
    }
}
