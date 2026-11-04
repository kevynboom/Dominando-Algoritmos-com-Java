import java.util.Scanner;

public class Ex46_IngressosCinema {
    static int coletarInteiras(Scanner sc) {
        System.out.print("Quantidade de ingressos inteiras: ");
        return Integer.parseInt(sc.nextLine());
    }

    static int coletarMeias(Scanner sc) {
        System.out.print("Quantidade de ingressos meias: ");
        return Integer.parseInt(sc.nextLine());
    }

    static String coletarDia(Scanner sc) {
        System.out.print("Digite o dia da semana: ");
        return sc.nextLine();
    }

    static boolean coletarNacional(Scanner sc) {
        System.out.print("O filme é nacional? (Sim ou Não): ");
        return sc.nextLine().equalsIgnoreCase("sim");
    }

    static double processarTotal(int inteiras, int meias, String dia, boolean nacional) {
        double valorIngresso = switch (dia.toLowerCase()) {
            case "quarta-feira" -> nacional ? 5.00 : 14.50;
            default -> nacional ? 5.00 : 28.50;
        };

        return (inteiras + meias) * valorIngresso;
    }

    static void exibirResultado(double total) {
        System.out.printf("Total à pagar: R$ %.2f%n", total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inteiras = coletarInteiras(sc);
        int meias = coletarMeias(sc);
        String dia = coletarDia(sc);
        boolean nacional = coletarNacional(sc);

        double total = processarTotal(inteiras, meias, dia, nacional);

        exibirResultado(total);

        sc.close();
    }
}