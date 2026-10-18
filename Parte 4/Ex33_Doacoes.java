import java.util.Scanner;

public class Ex33_Doacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do projeto de caridade: ");
        String nomeProjeto = sc.nextLine();

        System.out.print("Digite a quantidade de doações recebidas: ");
        int qtdDoacoes = sc.nextInt();

        System.out.print("Digite o valor da meta financeira: ");
        double meta = sc.nextDouble();

        double[] doacoes = new double[qtdDoacoes];
        double totalArrecadado = 0;

        for (int i = 0; i < qtdDoacoes; i++) {
            System.out.printf("Digite o valor da doação %d: ", (i + 1));
            doacoes[i] = sc.nextDouble();
            totalArrecadado += doacoes[i];
        }

        double maiorDoacao = doacoes[0];
        for (int i = 1; i < qtdDoacoes; i++) {
            if (doacoes[i] > maiorDoacao) {
                maiorDoacao = doacoes[i];
            }
        }

        System.out.println("\n>> Resumo das Doações <<");
        System.out.printf("Projeto: %s\n", nomeProjeto);
        System.out.print("Doações recebidas: ");
        for (int i = 0; i < qtdDoacoes; i++) {
            System.out.printf("%.0f", doacoes[i]);
            if (i < qtdDoacoes - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.printf("Total arrecadado: %.0f\n", totalArrecadado);
        System.out.printf("Maior doação: %.0f\n", maiorDoacao);

        if (totalArrecadado >= meta) {
            System.out.println("Situação: Meta atingida");
        } else {
            System.out.println("Situação: Meta não atingida");
        }

        sc.close();
    }
}