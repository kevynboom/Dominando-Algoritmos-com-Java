import java.util.Scanner;

public class Ex48_SistemaBancario {
    static Scanner sc = new Scanner(System.in);
    static double saldo = 0;
    static int opcao;
    static double valor;

    public static void coletarDados() {
        opcao = sc.nextInt();

        if (opcao == 2 || opcao == 3) {
            valor = sc.nextDouble();
        }
    }

    public static void processarDados() {
        if (opcao == 2) {
            if (valor < 0) {
                System.out.println("Valor inválido");
            } else {
                saldo += valor;
            }
        } else if (opcao == 3) {
            if (valor < 0) {
                System.out.println("Valor inválido");
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente");
            } else {
                saldo -= valor;
            }
        } else if (opcao < 0 || opcao > 3) {
            System.out.println("Opção inválida");
        }
    }

    public static void exibirResultado() {
        if (opcao == 1 || opcao == 2 || opcao == 3) {
            System.out.printf("Saldo atual: R$ %.0f%n", saldo);
        }
    }

    public static void main(String[] args) {
        do {
            coletarDados();
            processarDados();
            exibirResultado();
        } while (opcao != 0);
    }
}