import java.util.Scanner;

public class Ex28_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a posição desejada: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Posição inválida.");
        } else if (n == 1 || n == 2) {
            System.out.printf("O valor na posição %d da sequência de Fibonacci é 1\n", n);
        } else {
            long anterior = 1;
            long atual = 1;
            long proximo;

            for (int i = 3; i <= n; i++) {
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }

            System.out.printf("O valor na posição %d da sequência de Fibonacci é %d\n", n, atual);
        }

        sc.close();
    }
}