
import java.util.Scanner;

public class Ex43_MetaPessoal {

    public static String coletarMeta(Scanner sc) {
        System.out.print("Descrição da meta: ");
        return sc.nextLine();
    }

    public static double coletarValorMeta(Scanner sc) {
        System.out.print("Valor necessário para atingir a meta: R$ ");
        return sc.nextDouble();
    }

    public static double coletarSalario(Scanner sc) {
        System.out.print("Salário mensal: R$ ");
        return sc.nextDouble();
    }

    public static double coletarDespesas(Scanner sc) {
        System.out.print("Total das despesas mensais: R$ ");
        return sc.nextDouble();
    }

    public static double[] processarDados(double valorMeta, double salario, double despesas) {
        double saldo = salario - despesas;
        double reserva = saldo * 0.30;
        double disponivel = saldo - reserva;
        double prazo = disponivel > 0 ? valorMeta / disponivel : -1;

        return new double[]{saldo, reserva, disponivel, prazo};
    }

    public static void exibirResultado(String meta, double valorMeta, double salario, double despesas, double[] resultados) {
        System.out.printf("%nMeta: %s (R$ %.2f)%n", meta, valorMeta);
        System.out.printf("Salário: R$ %.2f - Despesas: R$ %.2f%n", salario, despesas);

        System.out.printf("%nSaldo após despesas: R$ %.2f%n", resultados[0]);
        System.out.printf("Reserva fixa (30%%): R$ %.2f%n", resultados[1]);
        System.out.printf("Valor disponível para a meta: R$ %.2f por mês%n", resultados[2]);

        if (resultados[3] >= 0) {
            System.out.printf("Prazo estimado para atingir a meta: %.2f meses%n", resultados[3]);
        } else {
            System.out.println("Não há valor disponível para atingir a meta.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String meta = coletarMeta(sc);
        double valorMeta = coletarValorMeta(sc);
        double salario = coletarSalario(sc);
        double despesas = coletarDespesas(sc);

        double[] resultados = processarDados(valorMeta, salario, despesas);

        exibirResultado(meta, valorMeta, salario, despesas, resultados);

        sc.close();
    }
}
