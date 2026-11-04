import java.util.Scanner;

public class Ex44_CalculadoraComMenu {

    public static double coletarPrimeiroValor(Scanner sc) {
        System.out.print("Digite o primeiro valor: ");
        return sc.nextDouble();
    }

    public static double coletarSegundoValor(Scanner sc) {
        System.out.print("Digite o segundo valor: ");
        return sc.nextDouble();
    }

    public static String coletarOperacao(Scanner sc) {
        sc.nextLine();

        System.out.println("\n===== CALCULADORA =====");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Resto");
        System.out.println("6. Potência");
        System.out.print("Escolha uma operação: ");

        return sc.nextLine().toLowerCase();
    }

    public static double processarDados(double valor1, double valor2, String operacao) {
        return switch (operacao) {
            case "1", "soma" -> valor1 + valor2;
            case "2", "subtração", "subtracao" -> valor1 - valor2;
            case "3", "multiplicação", "multiplicacao" -> valor1 * valor2;
            case "4", "divisão", "divisao" -> valor2 != 0 ? valor1 / valor2 : Double.NaN;
            case "5", "resto" -> valor2 != 0 ? valor1 % valor2 : Double.NaN;
            case "6", "potência", "potencia" -> Math.pow(valor1, valor2);
            default -> Double.NaN;
        };
    }

    public static void exibirResultado(double valor1, double valor2, String operacao, double resultado) {
        if (Double.isNaN(resultado)) {
            if (operacao.equals("4") || operacao.equals("divisão") || operacao.equals("divisao") ||
                operacao.equals("5") || operacao.equals("resto")) {
                System.out.println("Não é possível dividir por zero.");
            } else {
                System.out.println("Operação não suportada.");
            }
            return;
        }

        String simbolo = "";

        switch (operacao) {
            case "1", "soma" -> simbolo = "+";
            case "2", "subtração", "subtracao" -> simbolo = "-";
            case "3", "multiplicação", "multiplicacao" -> simbolo = "*";
            case "4", "divisão", "divisao" -> simbolo = "/";
            case "5", "resto" -> simbolo = "mod";
            case "6", "potência", "potencia" -> simbolo = "^";
        }

        System.out.printf("%.1f %s %.1f = %.1f%n", valor1, simbolo, valor2, resultado);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor1 = coletarPrimeiroValor(sc);
        double valor2 = coletarSegundoValor(sc);
        String operacao = coletarOperacao(sc);
        double resultado = processarDados(valor1, valor2, operacao);

        exibirResultado(valor1, valor2, operacao, resultado);

        sc.close();
    }
}
