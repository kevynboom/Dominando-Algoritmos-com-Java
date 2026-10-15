import java.util.Locale;
import java.util.Scanner;

public class Ex03_MediaDeNotas {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3;
        float media;

        System.out.println("--- Média do Aluno ---");
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextFloat();

        media = (nota1 + nota2 + nota3) / 3; // Calculando a média

        System.out.println("\n--- Resultado ---");
        System.out.printf("Média do aluno: %.2f%n", media);

        sc.close();
    }
}