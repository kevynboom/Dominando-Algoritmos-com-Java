import java.util.Scanner;

public class Ex24_CaixaMercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valor;
        double total = 0;

        do {
            System.out.print("Digite o valor do produto (0 para encerrar): ");
            valor = sc.nextDouble();

            if (valor == 0) {
                break;
            }

            if (valor < 0) {
                System.out.printf("Valor inválido: %.0f\n", valor);
            } else {
                total += valor;
            }
        } while (true);

        System.out.print("Em quantas vezes deseja parcelar (0 ou 1 para à vista, > 1 para parcelado)? ");
        int parcelas = sc.nextInt();

        if (parcelas <= 1) {
            System.out.printf("Pagamento à vista: R$ %.2f\n", total);
        } else {
            double valorParcela = total / parcelas;
            System.out.printf("Total da compra: R$ %.2f\n", total);
            System.out.printf("Parcelado em %dx de R$ %.2f\n", parcelas, valorParcela);
        }

        sc.close();
    }
}