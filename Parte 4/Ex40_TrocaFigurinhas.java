import java.util.Scanner;

public class Ex40_TrocaFigurinhas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdA = sc.nextInt();
        int[] jogadorA = new int[qtdA];

        for (int i = 0; i < qtdA; i++) {
            jogadorA[i] = sc.nextInt();
        }

        int qtdB = sc.nextInt();
        int[] jogadorB = new int[qtdB];

        for (int i = 0; i < qtdB; i++) {
            jogadorB[i] = sc.nextInt();
        }

        System.out.print("Figurinhas em comum: ");

        boolean primeira = true;

        for (int i = 0; i < qtdA; i++) {
            boolean encontrou = false;

            for (int j = 0; j < qtdB; j++) {
                if (jogadorA[i] == jogadorB[j]) {
                    encontrou = true;
                }
            }

            if (encontrou) {
                if (!primeira) {
                    System.out.print(", ");
                }

                System.out.print(jogadorA[i]);
                primeira = false;
            }
        }

        if (primeira) {
            System.out.print("Nenhuma");
        }
        System.out.println();

        System.out.print("Apenas jogador A: ");
        primeira = true;
        int exclusivosA = 0;

        for (int i = 0; i < qtdA; i++) {
            boolean encontrou = false;

            for (int j = 0; j < qtdB; j++) {
                if (jogadorA[i] == jogadorB[j]) {
                    encontrou = true;
                }
            }

            if (!encontrou) {
                if (!primeira) {
                    System.out.print(", ");
                }

                System.out.print(jogadorA[i]);
                primeira = false;
                exclusivosA++;
            }
        }

        if (primeira) {
            System.out.print("Nenhuma");
        }

        System.out.println();
        System.out.print("Apenas jogador B: ");
        primeira = true;
        int exclusivosB = 0;

        for (int i = 0; i < qtdB; i++) {
            boolean encontrou = false;

            for (int j = 0; j < qtdA; j++) {
                if (jogadorB[i] == jogadorA[j]) {
                    encontrou = true;
                }
            }

            if (!encontrou) {
                if (!primeira) {
                    System.out.print(", ");
                }

                System.out.print(jogadorB[i]);
                primeira = false;
                exclusivosB++;
            }
        }

        if (primeira) {
            System.out.print("Nenhuma");
        }

        System.out.println();
        int trocas = exclusivosA;

        if (exclusivosB < trocas) {
            trocas = exclusivosB;
        }

        System.out.println("Quantidade de trocas possíveis: " + trocas);

        sc.close();
    }
}