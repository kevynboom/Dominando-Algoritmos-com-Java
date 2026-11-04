import java.util.Scanner;

public class Ex45_MensalidadeUniversidade {

    public static String[] coletarDados(Scanner sc) {
        String[] dados = new String[3];

        dados[0] = sc.next();
        dados[1] = sc.next();
        dados[2] = sc.next();

        return dados;
    }

    public static double processarDados(String[] dados) {
        double valor;

        if (dados[0].equalsIgnoreCase("SI")) {
            valor = 900;
        } else if (dados[0].equalsIgnoreCase("ADS")) {
            valor = 750;
        } else if (dados[0].equalsIgnoreCase("CS")) {
            valor = 1150;
        } else if (dados[0].equalsIgnoreCase("EC")) {
            valor = 1300;
        } else if (dados[0].equalsIgnoreCase("ES")) {
            valor = 950;
        } else {
            return -1;
        }

        if (dados[1].equalsIgnoreCase("Sim")) {
            valor = 0;
        } else {
            double desconto = Double.parseDouble(dados[2]);
            valor = valor - (valor * desconto / 100);
        }

        return valor;
    }

    public static void exibirResultado(double valor) {
        if (valor == -1) {
            System.out.println("Curso não encontrado");
        } else {
            System.out.println("Valor da mensalidade:");
            System.out.printf("R$ %.2f%n", valor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dados = coletarDados(sc);
        double valor = processarDados(dados);
        exibirResultado(valor);

        sc.close();
    }
}