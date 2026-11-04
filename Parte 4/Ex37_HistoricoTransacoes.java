import java.util.Scanner;

public class Ex37_HistoricoTransacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] transacoes = new int[1000];
        int qtd = 0, operacoes = 0, valor, saldo = 0;

        while (operacoes < 1000) {
            System.out.print("Digite o valor da transação (-1 para encerrar): ");
            valor = sc.nextInt();

            if (valor == -1) {
                break;
            }

            operacoes++;

            if (valor == 0) {
                if (qtd > 0) {
                    qtd--;
                }
            } else {
                transacoes[qtd] = valor;
                qtd++;
            }
        }

        for (int i = 0; i < qtd; i++) {
            saldo += transacoes[i];
        }

        System.out.printf("%nSaldo final: %d%n", saldo);

        sc.close();
    }
}