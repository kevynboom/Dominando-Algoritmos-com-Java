import java.util.Locale;
import java.util.Scanner;

public class Ex02_ChurrascoDeDomingo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        int pessoas;

        System.out.println("--- Churrasco de Domingo ---");
        System.out.print("Digite a quantidade de pessoas: ");
        pessoas = sc.nextInt();

        // Quantidade de cada alimento por pessoa
        float carnePorPessoa = 0.300f;
        float linguicaPorPessoa = 0.200f;
        float frangoPorPessoa = 0.150f;

        // Preço por kg
        float precoCarne = 50.00f;
        float precoLinguica = 28.00f;
        float precoFrango = 22.00f;

        // Quantidade total em kg
        float carneTotal = carnePorPessoa * pessoas;
        float linguicaTotal = linguicaPorPessoa * pessoas;
        float frangoTotal = frangoPorPessoa * pessoas;

        // Custo de cada alimento
        float custoCarne = carneTotal * precoCarne;
        float custoLinguica = linguicaTotal * precoLinguica;
        float custoFrango = frangoTotal * precoFrango;

        // Custo total e valor por pessoa
        float custoTotal = custoCarne + custoLinguica + custoFrango;
        float valorPorPessoa = custoTotal / pessoas;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Carne: %.2f kg - R$%.2f%n", carneTotal, custoCarne);
        System.out.printf("Linguiça: %.2f kg - R$%.2f%n", linguicaTotal, custoLinguica);
        System.out.printf("Frango: %.2f kg - R$%.2f%n", frangoTotal, custoFrango);

        System.out.printf("%nCusto total: R$%.2f%n", custoTotal);
        System.out.printf("Cada pessoa deve pagar: R$%.2f%n", valorPorPessoa);

        // Que exercício maluco XD
        sc.close();
    }
}