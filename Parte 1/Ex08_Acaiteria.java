import java.util.Scanner;

public class Ex08_Acaiteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pequeno;
        int medio;
        int grande;

        float desconto;
        float valorTotal;
        float valorDesconto;
        float valorFinal;

        System.out.println("--- Venda de Açaí ---");
        System.out.print("Digite a quantidade de açaí pequeno: ");
        pequeno = sc.nextInt();

        System.out.print("Digite a quantidade de açaí médio: ");
        medio = sc.nextInt();

        System.out.print("Digite a quantidade de açaí grande: ");
        grande = sc.nextInt();

        System.out.print("Digite a porcentagem de desconto: ");
        desconto = sc.nextFloat();

        valorTotal = (pequeno * 13.50f) + (medio * 15.00f) + (grande * 17.50f); // Calculando o valor total da venda
        valorDesconto = valorTotal * desconto / 100; // Calculando o valor do desconto
        valorFinal = valorTotal - valorDesconto; // Calculando o valor final

        System.out.println("\n--- Resultado ---");
        System.out.println("Açaí pequeno: " + pequeno);
        System.out.println("Açaí médio: " + medio);
        System.out.println("Açaí grande: " + grande);
        System.out.printf("Valor total: R$%.2f%n", valorTotal);
        System.out.printf("Desconto: %.2f%%%n", desconto);
        System.out.printf("Valor final: R$%.2f%n", valorFinal);

        sc.close();
    }
}