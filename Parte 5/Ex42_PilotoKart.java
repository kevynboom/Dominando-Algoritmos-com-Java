import java.util.Scanner;

public class Ex42_PilotoKart {
    public static double[] coletarDados(Scanner sc) {
        double[] dados = new double[3];

        System.out.print("Digite o tamanho da pista em metros: ");
        dados[0] = sc.nextDouble();

        System.out.print("Digite a quantidade de voltas: ");
        dados[1] = sc.nextDouble();

        System.out.print("Digite o tempo da primeira volta em segundos: ");
        dados[2] = sc.nextDouble();

        return dados;
    }

    public static double[] processarDados(double[] dados) {
        double[] resultados = new double[2];

        resultados[0] = (dados[0] * dados[1]) / 1000;
        resultados[1] = (dados[2] * dados[1]) / 60;

        return resultados;
    }

    public static void exibirResultado(double[] resultados) {
        System.out.println("\nAnálise Preditiva Concluída");
        System.out.println("--");
        System.out.printf("Distância total a ser percorrida: %.2f km.%n", resultados[0]);
        System.out.printf("Previsão de conclusão: %.1f minutos.%n", resultados[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] dados = coletarDados(sc);
        double[] resultados = processarDados(dados);
        exibirResultado(resultados);

        sc.close();
    }
}