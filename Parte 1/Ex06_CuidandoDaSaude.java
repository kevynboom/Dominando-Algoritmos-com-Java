import java.util.Locale;
import java.util.Scanner;

public class Ex06_CuidandoDaSaude {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        float peso;
        float altura;
        float imc;

        System.out.println("--- Calculadora de IMC ---");
        System.out.print("Digite o seu peso em kg: ");
        peso = sc.nextFloat();

        System.out.print("Digite a sua altura em metros: ");
        altura = sc.nextFloat();

        imc = peso / (altura * altura); // Calculando o IMC

        System.out.println("\n--- Resultado ---");
        System.out.printf("Peso: %.2f kg%n", peso);
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("IMC: %.2f%n", imc);

        sc.close();
    }
}