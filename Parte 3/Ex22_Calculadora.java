import java.util.Scanner;

public class Ex22_Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.print("Digite a opção: ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Fim.");
            } else if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro valor: ");
                double n1 = sc.nextDouble();
                System.out.print("Digite o segundo valor: ");
                double n2 = sc.nextDouble();

                switch (opcao) {
                    case 1 -> System.out.printf("Resultado: %.2f + %.2f = %.2f\n", n1, n2, (n1 + n2));
                    case 2 -> System.out.printf("Resultado: %.2f - %.2f = %.2f\n", n1, n2, (n1 - n2));
                    case 3 -> System.out.printf("Resultado: %.2f * %.2f = %.2f\n", n1, n2, (n1 * n2));
                    case 4 -> {
                        if (n2 == 0) {
                            System.out.println("Divisão por zero não permitida");
                        } else {
                            System.out.printf("Resultado: %.2f / %.2f = %.2f\n", n1, n2, (n1 / n2));
                        }
                    }
                }
            } else {
                System.out.println("Opção inválida");
            }
        } while (opcao != 0);

        sc.close();
    }
}