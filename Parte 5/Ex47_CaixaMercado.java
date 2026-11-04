import java.util.Scanner;

public class Ex47_CaixaMercado {
    static double coletarCompras(Scanner sc) {
        double total = 0;
        double valor;

        do {
            System.out.print("Digite o valor da compra (0 para encerrar): ");
            valor = Double.parseDouble(sc.nextLine().replace(",", "."));

            if (valor < 0) {
                exibirValorInvalido(valor);
            } else {
                total = processarTotal(total, valor);
            }
        } while (valor != 0);

        return total;
    }

    static double processarTotal(double total, double valor) {
        return total + valor;
    }

    static int coletarParcelas(Scanner sc) {
        System.out.print("Em quantas vezes deseja parcelar? ");
        return Integer.parseInt(sc.nextLine());
    }

    static double processarParcela(double total, int parcelas) {
        return total / parcelas;
    }

    static void exibirValorInvalido(double valor) {
        System.out.printf("Valor inválido: %.2f%n", valor);
    }

    static void exibirResultado(double total, int parcelas, double valorParcela) {
        if (parcelas <= 1) {
            System.out.printf("Pagamento à vista: R$ %.2f%n", total);
        } else {
            System.out.printf("Total da compra: R$ %.2f%n", total);
            System.out.printf("Parcelado em %dx de R$ %.2f%n", parcelas, valorParcela);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = coletarCompras(sc);
        int parcelas = coletarParcelas(sc);
        double valorParcela = parcelas > 1 ? processarParcela(total, parcelas) : total;

        exibirResultado(total, parcelas, valorParcela);

        sc.close();
    }
}