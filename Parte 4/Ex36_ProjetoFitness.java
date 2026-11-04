import java.util.Scanner;

public class Ex36_ProjetoFitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias monitorados: ");
        int qtd = sc.nextInt();

        double[] pesos = new double[qtd];
        double maiorPeso = 0, menorPeso = 0;
        int diaMaior = 0, diaMenor = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite o peso do dia %d (kg): ", i + 1);
            pesos[i] = sc.nextDouble();

            if (i == 0 || pesos[i] > maiorPeso) {
                maiorPeso = pesos[i];
                diaMaior = i + 1;
            }

            if (i == 0 || pesos[i] < menorPeso) {
                menorPeso = pesos[i];
                diaMenor = i + 1;
            }
        }

        System.out.print("\nPesos informados: ");
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%.0f%s", pesos[i], i < qtd - 1 ? ", " : "\n");
        }

        System.out.printf("Maior peso: %.0f kg (Dia %d)%n", maiorPeso, diaMaior);
        System.out.printf("Menor peso: %.0f kg (Dia %d)%n", menorPeso, diaMenor);

        System.out.println("\nGráfico de evolução:");

        for (int i = 0; i < qtd; i++) {
            int barras = (int) (pesos[i] / 5);

            System.out.printf("Dia %d | ", i + 1);

            for (int j = 0; j < barras; j++) {
                System.out.print("■");
            }

            System.out.printf(" %.0f%n", pesos[i]);
        }

        sc.close();
    }
}