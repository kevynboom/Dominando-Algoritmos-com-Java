import java.util.Scanner;

public class Ex50_AnaliseMensalFaturamento {
    static int coletarMeses(Scanner sc) {
        System.out.print("Quantidade de meses analisados: ");
        return Integer.parseInt(sc.nextLine());
    }

    static double[] coletarFaturamento(Scanner sc, int meses) {
        double[] faturamentos = new double[meses];

        for (int i = 0; i < meses; i++) {
            System.out.printf("Faturamento do mês %d: ", i + 1);
            faturamentos[i] = Double.parseDouble(sc.nextLine().replace(",", "."));
        }

        return faturamentos;
    }

    static String processarAnalise(double[] faturamentos) {
        boolean crescimento = true, queda = true, constante = true;

        for (int i = 1; i < faturamentos.length; i++) {
            if (faturamentos[i] < faturamentos[i - 1]) crescimento = false;
            if (faturamentos[i] > faturamentos[i - 1]) queda = false;
            if (faturamentos[i] != faturamentos[i - 1]) constante = false;
        }

        if (constante) return "Constante";
        if (crescimento) return "Crescimento";
        if (queda) return "Queda";

        return "Sem padrão";
    }

    static void exibirResultado(double[] faturamentos, String situacao) {
        System.out.println("\n>> Análise de Faturamento <<");
        System.out.print("Faturamento informado: ");

        for (int i = 0; i < faturamentos.length; i++) {
            System.out.printf("%.2f", faturamentos[i]);
            if (i < faturamentos.length - 1) System.out.print(", ");
        }

        System.out.printf("%nSituação: %s%n", situacao);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meses = coletarMeses(sc);
        double[] faturamentos = coletarFaturamento(sc, meses);
        String situacao = processarAnalise(faturamentos);

        exibirResultado(faturamentos, situacao);

        sc.close();
    }
}