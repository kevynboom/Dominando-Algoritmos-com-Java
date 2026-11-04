import java.util.Scanner;

public class Ex48_SistemaBancario {
    static int coletarOpcao(Scanner sc) {
        exibirMenu();
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(sc.nextLine());
    }

    static void exibirMenu() {
        System.out.println("\nMenu de Opções");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Realizar Depósito");
        System.out.println("3. Realizar Saque");
        System.out.println("0. Sair");
    }

    static double coletarValor(Scanner sc, String operacao) {
        System.out.printf("Digite o valor para %s: ", operacao);
        return Double.parseDouble(sc.nextLine().replace(",", "."));
    }

    static double processarDeposito(double saldo, double valor) {
        return valor < 0 ? saldo : saldo + valor;
    }

    static double processarSaque(double saldo, double valor) {
        return valor < 0 || valor > saldo ? saldo : saldo - valor;
    }

    static void exibirSaldo(double saldo) {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        int opcao;

        do {
            opcao = coletarOpcao(sc);

            switch (opcao) {
                case 1 -> exibirSaldo(saldo);
                case 2 -> {
                    double deposito = coletarValor(sc, "depósito");

                    if (deposito < 0) {
                        exibirMensagem("Valor inválido");
                    } else {
                        saldo = processarDeposito(saldo, deposito);
                        exibirSaldo(saldo);
                    }
                }
                case 3 -> {
                    double saque = coletarValor(sc, "saque");

                    if (saque < 0) {
                        exibirMensagem("Valor inválido");
                    } else if (saque > saldo) {
                        exibirMensagem("Saldo insuficiente");
                    } else {
                        saldo = processarSaque(saldo, saque);
                        exibirSaldo(saldo);
                    }
                }
                case 0 -> exibirMensagem("Sistema encerrado.");
                default -> exibirMensagem("Opção inválida");
            }
        } while (opcao != 0);

        sc.close();
    }
}