import java.util.Scanner;

public class Ex29_DesenharRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        int base = sc.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        int altura = sc.nextInt();

        if (base <= 0 || altura <= 0) {
            System.out.println("Retângulo inválido");
        } else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}