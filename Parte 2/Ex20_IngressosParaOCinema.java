import java.util.Scanner;

public class Ex20_IngressosParaOCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de ingressos inteiras: ");
        int qtdInteiras = sc.nextInt();
        System.out.print("Digite a quantidade de ingressos meias: ");
        int qtdMeias = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o dia da semana: ");
        String diaSemana = sc.nextLine();
        System.out.print("O filme é nacional (Sim ou Não)? ");
        String nacional = sc.nextLine();

        double precoIngresso = 28.50;

        if (nacional.equalsIgnoreCase("Sim")) {
            precoIngresso = 5.00;
        } else if (diaSemana.equalsIgnoreCase("Quarta-feira")) {
            precoIngresso = 14.50;
        }

        double total = (qtdInteiras * precoIngresso) + (qtdMeias * (precoIngresso / 2.0));

        System.out.printf("Total à pagar:\nR$ %.2f\n", total);

        sc.close();
    }
}