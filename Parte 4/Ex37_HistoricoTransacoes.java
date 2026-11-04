import java.util.Scanner;

public class Ex37_HistoricoTransacoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] transacoes = new int[1000];
        int qtd = 0;
        int valor;

        for (int i = 0; i < 1000; i++) {
            valor = sc.nextInt();

            if (valor == -1) {
                break;
            }

            if (valor == 0) {

                if (qtd > 0) {
                    qtd--;
                }

            } else {
                transacoes[qtd] = valor;
                qtd++;
            }
        }
        int saldo = 0;

        for (int i = 0; i < qtd; i++) {
            saldo += transacoes[i];
        }

        System.out.println("Saldo final: " + saldo);

        sc.close();
    }
}