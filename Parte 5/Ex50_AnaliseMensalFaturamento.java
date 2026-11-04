import java.util.Scanner;

public class Ex50_AnaliseMensalFaturamento {
    static Scanner sc = new Scanner(System.in);
    static int[] faturamentos;
    static int quantidade;
    static String situacao;

    public static void coletarDados() {
        quantidade = sc.nextInt();
        faturamentos = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            faturamentos[i] = sc.nextInt();
        }
    }

    public static void processarDados() {
        boolean crescimento = true;
        boolean queda = true;
        boolean constante = true;

        for (int i = 1; i < quantidade; i++) {
            if (faturamentos[i] < faturamentos[i - 1]) {
                crescimento = false;
            }

            if (faturamentos[i] > faturamentos[i - 1]) {
                queda = false;
            }

            if (faturamentos[i] != faturamentos[i - 1]) {
                constante = false;
            }
        }

        if (constante) {
            situacao = "Constante";
        } else if (crescimento) {
            situacao = "Crescimento";
        } else if (queda) {
            situacao = "Queda";
        } else {
            situacao = "Sem padrão";
        }
    }

    public static void exibirResultado() {
        System.out.println(">> Análise de Faturamento <<");
        System.out.print("Faturamento informado: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(faturamentos[i]);

            if (i < quantidade - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Situação: " + situacao);
    }

    public static void main(String[] args) {
        coletarDados();
        processarDados();
        exibirResultado();
    }
}