import java.util.Scanner;

public class Ex30_DesenharTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura do triângulo: ");
        int altura = sc.nextInt();

        if (altura <= 0) {
            System.out.println("Triângulo inválido");
        } else {
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}