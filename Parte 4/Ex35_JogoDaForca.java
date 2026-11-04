import java.util.Scanner;

public class Ex35_JogoDaForca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a palavra secreta: ");
        char[] palavra = sc.nextLine().toUpperCase().toCharArray();

        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        char[] estado = new char[palavra.length];
        int erros = 0;

        for (int i = 0; i < estado.length; i++) {
            estado[i] = '_';
        }

        while (erros < 7) {
            boolean acertou = true;

            for (int i = 0; i < estado.length; i++) {
                if (estado[i] == '_') {
                    acertou = false;
                    break;
                }
            }

            if (acertou) {
                break;
            }

            System.out.print("Digite uma letra: ");
            char letra = sc.nextLine().toUpperCase().charAt(0);

            boolean encontrou = false;

            for (int i = 0; i < palavra.length; i++) {
                if (palavra[i] == letra) {
                    estado[i] = letra;
                    encontrou = true;
                }
            }

            if (!encontrou) {
                erros++;
            }

            System.out.print("\nEstado: ");
            for (int i = 0; i < estado.length; i++) {
                System.out.printf("%c%s", estado[i], i < estado.length - 1 ? " " : "\n");
            }

            System.out.printf("Erros: %d%n", erros);
        }

        boolean venceu = true;

        for (int i = 0; i < estado.length; i++) {
            if (estado[i] == '_') {
                venceu = false;
                break;
            }
        }

        if (venceu) {
            System.out.println("\nParabéns! Você descobriu a palavra.");
        } else {
            System.out.printf("%nVocê perdeu! A palavra era: %s%n", new String(palavra));
        }

        sc.close();
    }
}