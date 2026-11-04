import java.util.Scanner;

public class Ex35_JogoDaForca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = sc.next().toUpperCase();
        int tamanho = palavra.length();
        char[] secreta = new char[tamanho];
        char[] estado = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            secreta[i] = palavra.charAt(i);
            estado[i] = '_';
        }

        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        int erros = 0;
        int descobertas = 0;

        while (erros < 7 && descobertas < tamanho) {
            char letra = sc.next().toUpperCase().charAt(0);
            boolean encontrou = false;

            for (int i = 0; i < tamanho; i++) {

                if (secreta[i] == letra) {

                    encontrou = true;

                    if (estado[i] == '_') {
                        estado[i] = letra;
                        descobertas++;
                    }
                }
            }

            if (!encontrou) {
                erros++;
            }

            System.out.print("Forca: ");

            for (int i = 0; i < tamanho; i++) {
                System.out.print(estado[i]);
            }

            System.out.println();

            System.out.println("Erros: " + erros);
            System.out.println();
        }

        if (descobertas == tamanho) {
            System.out.println("Parabéns! Você descobriu a palavra.");
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavra);
        }

        sc.close();
    }
}