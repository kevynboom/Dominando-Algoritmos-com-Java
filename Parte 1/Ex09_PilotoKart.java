import java.util.Locale;
import java.util.Scanner;

public class Ex09_PilotoKart {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        float tamanhoPista;
        int quantidadeVoltas;
        float tempoPrimeiraVolta;

        float distanciaTotal;
        float tempoTotal;

        System.out.println("--- Performance do Piloto ---");
        System.out.print("Digite o tamanho da pista em metros: ");
        tamanhoPista = sc.nextFloat();

        System.out.print("Digite a quantidade de voltas: ");
        quantidadeVoltas = sc.nextInt();

        System.out.print("Digite o tempo da primeira volta em segundos: ");
        tempoPrimeiraVolta = sc.nextFloat();

        distanciaTotal = (tamanhoPista * quantidadeVoltas) / 1000; // Calculando a distância total em quilômetros
        tempoTotal = (tempoPrimeiraVolta * quantidadeVoltas) / 60; // Calculando o tempo total em minutos

        System.out.println("\n--- Resultado ---");
        System.out.printf("Distância total da corrida: %.2f km%n", distanciaTotal);
        System.out.printf("Previsão de tempo: %.2f minutos%n", tempoTotal);

        sc.close();
    }
}