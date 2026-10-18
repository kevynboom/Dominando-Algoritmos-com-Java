import java.util.Scanner;

public class Ex25_DesafioDaSoletração {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a palavra original: ");
        String palavraOriginal = sc.nextLine();

        String palavraSoletrada = "";
        String letra;

        System.out.println("Digite a palavra letra por letra (digite '0' para encerrar): ");
        do {
            System.out.print("Digite uma letra: ");
            letra = sc.nextLine();

            if (letra.equals("0")) {
                break;
            }

            palavraSoletrada += letra;
        } while (true);

        System.out.printf("Palavra original: %s\n", palavraOriginal);
        System.out.printf("Palavra soletrada: %s\n", palavraSoletrada);

        sc.close();
    }
}