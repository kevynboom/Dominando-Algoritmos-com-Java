import java.util.Scanner;

public class Ex42_PilotoKart {

    public static double[] coletarDados(Scanner sc) {
        double[] dados = new double[3];
        dados[0] = sc.nextDouble();
        dados[1] = sc.nextDouble();
        dados[2] = sc.nextDouble();

        return dados;
    }

    public static double[] processarDados(double[] dados) {
        double[] resultado = new double[2];
        resultado[0] = (dados[0] * dados[1]) / 1000;
        resultado[1] = (dados[2] * dados[1]) / 60;

        return resultado;
    }

    public static void exibirResultado(double[] resultado) {
        System.out.println("Análise Preditiva Concluída");
        System.out.println("--");
        System.out.printf("Distância total a ser percorrida: %.2f km.%n", resultado[0]);
        System.out.printf("Previsão de conclusão: %.1f minutos.%n", resultado[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] dados = coletarDados(sc);
        double[] resultado = processarDados(dados);
        exibirResultado(resultado);

        sc.close();
    }
}