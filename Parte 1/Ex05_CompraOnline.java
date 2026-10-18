import java.util.Scanner;

public class Ex05_CompraOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valorCompra;
        float desconto;
        float valorDesconto;
        float valorFinal;

        System.out.println("--- Calculadora de Desconto ---");
        System.out.print("Digite o valor da compra: R$");
        valorCompra = sc.nextFloat();

        System.out.print("Digite a porcentagem de desconto: ");
        desconto = sc.nextFloat();

        valorDesconto = valorCompra * desconto / 100; // Calculando o valor do desconto
        valorFinal = valorCompra - valorDesconto; // Calculando o valor final

        System.out.println("\n--- Resultado ---");
        System.out.printf("Valor da compra: R$%.2f%n", valorCompra);
        System.out.printf("Desconto: %.2f%%%n", desconto);
        System.out.printf("Valor do desconto: R$%.2f%n", valorDesconto);
        System.out.printf("Valor final: R$%.2f%n", valorFinal);

        sc.close();
    }
}