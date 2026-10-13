import java.util.Locale;
import java.util.Scanner;

// 4. Faça um programa para simular a conversão de um valor em real para dólar. Considere a cotação do dólar em R$ 5,42.
public class Ex04_ComprasNoExterior {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        float valorReais;
        float valorDolar;
        float cotacao = 5.42f;

        System.out.println("--- Conversor de Real para Dólar ---");
        System.out.print("Digite o valor em reais: R$");
        valorReais = sc.nextFloat();

        valorDolar = valorReais / cotacao; // Calculando o valor em dólares

        System.out.println("\n--- Resultado ---");
        System.out.printf("Valor em reais: R$%.2f%n", valorReais);
        System.out.printf("Valor em dólares: US$%.2f%n", valorDolar);

        sc.close();
    }
}