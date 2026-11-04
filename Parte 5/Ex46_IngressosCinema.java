import java.util.Scanner;

public class Ex46_IngressosCinema {
    static Scanner sc = new Scanner(System.in);
    static int inteiras, meias;
    static String dia;
    static boolean nacional;
    static double total;

    public static void coletarDados() {
        inteiras = sc.nextInt();
        meias = sc.nextInt();
        sc.nextLine();
        dia = sc.nextLine();
        nacional = sc.nextLine().equalsIgnoreCase("Sim");
    }

    public static void processarDados() {
        double valor = 28.50;

        if (nacional) {
            valor = 5.00;
            total = (inteiras + meias) * valor;
        } else if (dia.equalsIgnoreCase("Quarta-feira")) {
            valor = 14.50;
            total = (inteiras + meias) * valor;
        } else {
            total = (inteiras * valor) + (meias * (valor / 2));
        }
    }

    public static void exibirResultado() {
        System.out.printf("Total à pagar:%nR$ %.2f%n", total);
    }

    public static void main(String[] args) {
        coletarDados();
        processarDados();
        exibirResultado();
    }
}