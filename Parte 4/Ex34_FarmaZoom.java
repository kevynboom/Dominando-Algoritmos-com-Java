import java.util.Scanner;

public class Ex34_FarmaZoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de medicamentos: ");
        int qtd = sc.nextInt();

        int[] farmaciaA = new int[qtd], farmaciaB = new int[qtd];
        int maisBaratosA = 0, maisBaratosB = 0, mesmoPreco = 0, totalA = 0, totalB = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite o preço do medicamento %d na Farmácia A: ", i + 1);
            farmaciaA[i] = sc.nextInt();
            totalA += farmaciaA[i];
        }

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite o preço do medicamento %d na Farmácia B: ", i + 1);
            farmaciaB[i] = sc.nextInt();
            totalB += farmaciaB[i];
        }

        System.out.println("\nFARMAZOOM");
        System.out.print("Farmácia A: ");
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%d%s", farmaciaA[i], i < qtd - 1 ? ", " : "\n");
        }

        System.out.print("Farmácia B: ");
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%d%s", farmaciaB[i], i < qtd - 1 ? ", " : "\n");
        }

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
        System.out.printf("Na Farmácia A: %d%n", maisBaratosA);
        System.out.printf("Na Farmácia B: %d%n", maisBaratosB);
        System.out.printf("Mesmo preço: %d%n", mesmoPreco);

        System.out.println("\nTotal");
        System.out.printf("Farmácia A: R$ %d%n", totalA);
        System.out.printf("Farmácia B: R$ %d%n", totalB);

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