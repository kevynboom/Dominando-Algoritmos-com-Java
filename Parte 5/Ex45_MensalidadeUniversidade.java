import java.util.Scanner;

public class Ex45_MensalidadeUniversidade {
    static String coletarCurso(Scanner sc) {
        System.out.print("Digite a sigla do curso: ");
        return sc.nextLine().toUpperCase();
    }

    static boolean coletarIsencao(Scanner sc) {
        System.out.print("O aluno é isento? (Sim ou Não): ");
        return sc.nextLine().equalsIgnoreCase("sim");
    }

    static double coletarDesconto(Scanner sc) {
        System.out.print("Digite o desconto (%): ");
        return Double.parseDouble(sc.nextLine().replace(",", "."));
    }

    static double processarMensalidade(String curso, boolean isento, double desconto) {
        double valor;

        switch (curso) {
            case "SI" -> valor = 900.00;
            case "ADS" -> valor = 750.00;
            case "CS" -> valor = 1150.00;
            case "EC" -> valor = 1300.00;
            case "ES" -> valor = 950.00;
            default -> {
                return -1;
            }
        }

        if (isento) return 0;

        return valor - (valor * desconto / 100);
    }

    static void exibirResultado(double mensalidade) {
        if (mensalidade == -1) {
            System.out.println("Curso não encontrado");
        } else {
            System.out.printf("Valor da mensalidade: R$ %.2f%n", mensalidade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String curso = coletarCurso(sc);
        boolean isento = coletarIsencao(sc);
        double desconto = coletarDesconto(sc);

        double mensalidade = processarMensalidade(curso, isento, desconto);

        exibirResultado(mensalidade);

        sc.close();
    }
}