import java.util.Scanner;

public class Ex26_SistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldo = 0;
        int opcao;

        do {
            System.out.print("Digite a opção (0-Sair, 1-Consultar, 2-Depositar, 3-Sacar): ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("Fim.");
                case 1 -> System.out.printf("Saldo atual: R$ %.0f\n", saldo);
                case 2 -> {
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = sc.nextDouble();
                    if (deposito < 0) {
                        System.out.println("Valor inválido");
                    } else {
                        saldo += deposito;
                    }
                }
                case 3 -> {
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    if (saque < 0) {
                        System.out.println("Valor inválido");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= saque;
                    }
                }
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 0);

        sc.close();
    }
}