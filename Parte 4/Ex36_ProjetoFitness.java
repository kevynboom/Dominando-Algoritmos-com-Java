import java.util.Scanner;

public class Ex36_ProjetoFitness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();
        int[] pesos = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            pesos[i] = sc.nextInt();
        }

        int maior = pesos[0];
        int menor = pesos[0];

        int diaMaior = 1;
        int diaMenor = 1;

        System.out.print("Pesos informados: ");

        for (int i = 0; i < qtd; i++) {

            System.out.print(pesos[i]);

            if (i < qtd - 1) {
                System.out.print(", ");
            }

            if (pesos[i] > maior) {
                maior = pesos[i];
                diaMaior = i + 1;
            }

            if (pesos[i] < menor) {
                menor = pesos[i];
                diaMenor = i + 1;
            }
        }

        System.out.println();

        System.out.println("Maior peso: " + maior + " kg (Dia " + diaMaior + ")");
        System.out.println("Menor peso: " + menor + " kg (Dia " + diaMenor + ")");

        System.out.println("\nGráfico de evolução:");

        for (int i = 0; i < qtd; i++) {

            System.out.print("Dia " + (i + 1) + " | ");
            int barras = pesos[i] / 5;
            for (int j = 0; j < barras; j++) {
                System.out.print("█");
            }
            System.out.println(" " + pesos[i]);
        }

        sc.close();
    }
}