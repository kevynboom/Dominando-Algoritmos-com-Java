import java.util.Scanner;

public class Ex34_FarmaZoom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();
        int[] farmaciaA = new int[qtd];
        int[] farmaciaB = new int[qtd];
        int maisBaratosA = 0;
        int maisBaratosB = 0;
        int mesmoPreco = 0;
        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < qtd; i++) {
            farmaciaA[i] = sc.nextInt();
            totalA += farmaciaA[i];
        }

        for (int i = 0; i < qtd; i++) {
            farmaciaB[i] = sc.nextInt();
            totalB += farmaciaB[i];
        }

        System.out.println("FARMAZOOM");

        System.out.print("Farmácia A: ");
        for (int i = 0; i < qtd; i++) {
            System.out.print(farmaciaA[i]);

            if (i < qtd - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.print("Farmácia B: ");
        for (int i = 0; i < qtd; i++) {
            System.out.print(farmaciaB[i]);

            if (i < qtd - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < qtd; i++) {
            if (farmaciaA[i] < farmaciaB[i]) {
                maisBaratosA++;
            } else if (farmaciaB[i] < farmaciaA[i]) {
                maisBaratosB++;
            } else {
                mesmoPreco++;
            }
        }

        System.out.println("\nProdutos mais Baratos");
        System.out.println("Na Farmácia A: " + maisBaratosA);
        System.out.println("Na Farmácia B: " + maisBaratosB);
        System.out.println("Mesmo preço: " + mesmoPreco);

        System.out.println("\nTotal");
        System.out.println("Farmácia A: R$ " + totalA);
        System.out.println("Farmácia B: R$ " + totalB);

        System.out.println("\nMelhor opção");

        if (totalA < totalB) {
            System.out.println("Farmácia A");
        } else if (totalB < totalA) {
            System.out.println("Farmácia B");
        } else {
            System.out.println("Empate");
        }

        sc.close();
    }
}