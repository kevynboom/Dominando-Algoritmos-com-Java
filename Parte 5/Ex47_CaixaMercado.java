import java.util.Scanner;

public class Ex47_CaixaMercado {
    static Scanner sc = new Scanner(System.in);
    static double total = 0;
    static int parcelas;

    public static void coletarDados() {
        double valor;

        do {
            valor = sc.nextDouble();

            if (valor < 0) {
                System.out.println("Valor inválido: " + (int) valor);
            } else if (valor > 0) {
                total += valor;
            }
        } while (valor != 0);

        parcelas = sc.nextInt();
    }

    public static void processarDados() {
        if (parcelas <= 1) {
            System.out.printf("Pagamento à vista: R$ %.0f%n", total);
        } else {
            System.out.printf("Total da compra: R$ %.0f%n", total);
            System.out.printf("Parcelado em %dx de R$ %.2f%n", parcelas, total / parcelas);
        }
    }

    public static void exibirResultado() {
    }

    public static void main(String[] args) {
        coletarDados();
        processarDados();
        exibirResultado();
    }
}