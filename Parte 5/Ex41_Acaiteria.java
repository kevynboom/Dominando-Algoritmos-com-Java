import java.util.Scanner;

public class Ex41_Acaiteria {

    public static double[] coletarDados(Scanner sc) {
        double[] dados = new double[4];
        dados[0] = sc.nextDouble();
        dados[1] = sc.nextDouble();
        dados[2] = sc.nextDouble();
        dados[3] = sc.nextDouble();

        return dados;
    }

    public static double processarPedido(double[] dados) {
        double total = 0;
        total += dados[0] * 13.50;
        total += dados[1] * 15.00;
        total += dados[2] * 17.50;
        total = total - (total * dados[3] / 100);

        return total;
    }

    public static void exibirResultado(double[] dados, double total) {
        System.out.println("Seu pedido foi registrado.");
        System.out.println("- Açaí P: " + (int) dados[0]);
        System.out.println("- Açaí M: " + (int) dados[1]);
        System.out.println("- Açaí G: " + (int) dados[2]);

        System.out.println();

        System.out.println("Desconto de " + (int) dados[3] + "% aplicado.");
        System.out.printf("Total R$ %.2f\n", total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] dados = coletarDados(sc);
        double total = processarPedido(dados);
        exibirResultado(dados, total);

        sc.close();
    }
}