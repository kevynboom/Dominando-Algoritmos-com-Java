import java.util.Scanner;

public class Ex08_Acaiteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pequeno, medio, grande;
        float desconto, valorTotal, valorDesconto, valorFinal;

        System.out.println("--- Venda de Açaí ---");
        System.out.print("Digite a quantidade de açaí pequeno: ");
        pequeno = sc.nextInt();

        System.out.print("Digite a quantidade de açaí médio: ");
        medio = sc.nextInt();

        System.out.print("Digite a quantidade de açaí grande: ");
        grande = sc.nextInt();

        System.out.print("Digite a porcentagem de desconto: ");
        desconto = sc.nextFloat();

        valorTotal = (pequeno * 13.50f) + (medio * 15.00f) + (grande * 17.50f); 
        valorDesconto = valorTotal * desconto / 100; 
        valorFinal = valorTotal - valorDesconto; 

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