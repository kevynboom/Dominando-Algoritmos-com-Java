import java.util.Scanner;

public class Ex40_TrocaFigurinhas {
    // Método auxiliar pra ajudar no código
    public static boolean existe(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de figurinhas do jogador 1: ");
        int qtd1 = sc.nextInt();

        int[] jogador1 = new int[qtd1];

        for (int i = 0; i < qtd1; i++) {
            System.out.printf("Digite o número da figurinha %d do jogador 1: ", i + 1);
            jogador1[i] = sc.nextInt();
        }

        System.out.print("Digite a quantidade de figurinhas do jogador 2: ");
        int qtd2 = sc.nextInt();

        int[] jogador2 = new int[qtd2];

        for (int i = 0; i < qtd2; i++) {
            System.out.printf("Digite o número da figurinha %d do jogador 2: ", i + 1);
            jogador2[i] = sc.nextInt();
        }

        int comuns = 0, exclusivas1 = 0, exclusivas2 = 0;

        System.out.print("\nFigurinhas em comum: ");
        boolean primeiro = true;

        for (int i = 0; i < qtd1; i++) {
            if (existe(jogador2, qtd2, jogador1[i]) && !existe(jogador1, i, jogador1[i])) {
                System.out.printf("%s%d", primeiro ? "" : ", ", jogador1[i]);
                primeiro = false;
                comuns++;
            }
        }

        if (primeiro) {
            System.out.print("Nenhuma");
        }

        System.out.print("\n\nApenas jogador A: ");
        primeiro = true;

        for (int i = 0; i < qtd1; i++) {
            if (!existe(jogador2, qtd2, jogador1[i]) && !existe(jogador1, i, jogador1[i])) {
                System.out.printf("%s%d", primeiro ? "" : ", ", jogador1[i]);
                primeiro = false;
                exclusivas1++;
            }
        }

        if (primeiro) {
            System.out.print("Nenhuma");
        }

        System.out.print("\nApenas jogador B: ");
        primeiro = true;

        for (int i = 0; i < qtd2; i++) {
            if (!existe(jogador1, qtd1, jogador2[i]) && !existe(jogador2, i, jogador2[i])) {
                System.out.printf("%s%d", primeiro ? "" : ", ", jogador2[i]);
                primeiro = false;
                exclusivas2++;
            }
        }

        if (primeiro) {
            System.out.print("Nenhuma");
        }

        int trocas = Math.min(exclusivas1, exclusivas2);
        
        System.out.printf("%n%nQuantidade de trocas possíveis: %d%n", trocas);

        sc.close();
    }
}