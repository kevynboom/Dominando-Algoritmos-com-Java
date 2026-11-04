import java.util.Scanner;

public class Ex41_Acaiteria {
    public static double[] coletarDados(Scanner sc) {
        double[] dados = new double[4];

        System.out.print("Digite a quantidade de açaís pequenos: ");
        dados[0] = sc.nextDouble();

        System.out.print("Digite a quantidade de açaís médios: ");
        dados[1] = sc.nextDouble();

        System.out.print("Digite a quantidade de açaís grandes: ");
        dados[2] = sc.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        dados[3] = sc.nextDouble();

        return dados;
    }

    public static double processarPedido(double[] dados) {
        double total = dados[0] * 13.50 + dados[1] * 15.00 + dados[2] * 17.50;
        return total - (total * dados[3] / 100);
    }

    public static void exibirResultado(double[] dados, double total) {
        System.out.println("\nSeu pedido foi registrado.");
        System.out.printf("- Açaí P: %.0f%n", dados[0]);
        System.out.printf("- Açaí M: %.0f%n", dados[1]);
        System.out.printf("- Açaí G: %.0f%n", dados[2]);
        System.out.printf("%nDesconto de %.0f%% aplicado.%n", dados[3]);
        System.out.printf("Total R$ %.2f%n", total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] dados = coletarDados(sc);
        double total = processarPedido(dados);
        exibirResultado(dados, total);

        sc.close();
    }
}