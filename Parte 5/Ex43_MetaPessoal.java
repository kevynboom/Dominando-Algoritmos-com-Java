import java.util.Scanner;

public class Ex43_MetaPessoal {

    public static String[] coletarDados(Scanner sc) {
        String[] dados = new String[4];

        dados[0] = sc.nextLine();
        dados[1] = sc.nextLine();
        dados[2] = sc.nextLine();
        dados[3] = sc.nextLine();

        return dados;
    }

    public static double[] processarDados(String[] dados) {
        double[] resultado = new double[4];

        double meta = Double.parseDouble(dados[1]);
        double salario = Double.parseDouble(dados[2]);
        double despesas = Double.parseDouble(dados[3]);

        double saldo = salario - despesas;
        double reserva = saldo * 0.30;
        double disponivel = saldo - reserva;
        double prazo = meta / disponivel;

        resultado[0] = saldo;
        resultado[1] = reserva;
        resultado[2] = disponivel;
        resultado[3] = prazo;

        return resultado;
    }

    public static void exibirResultado(String[] dados, double[] resultado) {
        System.out.println("Meta: " + dados[0] + " (R$ " + String.format("%.2f", Double.valueOf(dados[1])) + ")");
        System.out.println("Salário: R$ " + String.format("%.2f", Double.valueOf(dados[2])) + " - Despesas: R$ " + String.format("%.2f", Double.valueOf(dados[3])));
        System.out.println();
        System.out.printf("Saldo após despesas: R$ %.2f%n", resultado[0]);
        System.out.printf("Reserva fixa (30%%): R$ %.2f%n", resultado[1]);
        System.out.printf("Valor disponível para a meta: R$ %.2f por mês%n", resultado[2]);
        System.out.printf("Prazo estimado para atingir a meta: %.2f meses%n", resultado[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dados = coletarDados(sc);
        double[] resultado = processarDados(dados);
        exibirResultado(dados, resultado);

        sc.close();
    }
}