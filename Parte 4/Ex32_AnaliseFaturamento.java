import java.util.Scanner;

public class Ex32_AnaliseFaturamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de meses analisados: ");
        int n = sc.nextInt();

        double[] faturamento = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o faturamento do mês %d: ", (i + 1));
            faturamento[i] = sc.nextDouble();
        }

        boolean cresceu = true;
        boolean caiu = true;
        boolean constante = true;

        for (int i = 1; i < n; i++) {
            if (faturamento[i] > faturamento[i - 1]) {
                caiu = false;
                constante = false;
            } else if (faturamento[i] < faturamento[i - 1]) {
                cresceu = false;
                constante = false;
            }
        }

        System.out.println("\n>> Análise de Faturamento <<");
        System.out.print("Faturamento informado: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.0f", faturamento[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        if (constante) {
            System.out.println("Situação: Constante");
        } else if (cresceu) {
            System.out.println("Situação: Crescimento");
        } else if (caiu) {
            System.out.println("Situação: Queda");
        } else {
            System.out.println("Situação: Sem padrão");
        }

        sc.close();
    }
}