import java.util.Scanner;

public class Ex44_CalculadoraComMenu {

    public static String[] coletarDados(Scanner sc) {
        String[] dados = new String[3];

        dados[0] = sc.next();
        dados[1] = sc.next();
        dados[2] = sc.next();

        return dados;
    }

    public static String[] processarDados(String[] dados) {
        double n1 = Double.parseDouble(dados[0]);
        double n2 = Double.parseDouble(dados[1]);

        String operacao = dados[2];
        String simbolo = "";
        double resultado = 0;
        boolean valida = true;

        if (operacao.equals("1") || operacao.equalsIgnoreCase("Soma")) {
            simbolo = "+";
            resultado = n1 + n2;

        } else if (operacao.equals("2") || operacao.equalsIgnoreCase("Subtração")) {
            simbolo = "-";
            resultado = n1 - n2;

        } else if (operacao.equals("3") || operacao.equalsIgnoreCase("Multiplicação")) {
            simbolo = "*";
            resultado = n1 * n2;

        } else if (operacao.equals("4") || operacao.equalsIgnoreCase("Divisão")) {
            simbolo = "/";
            resultado = n1 / n2;

        } else if (operacao.equals("5") || operacao.equalsIgnoreCase("Resto")) {
            simbolo = "mod";
            resultado = n1 % n2;

        } else if (operacao.equals("6") || operacao.equalsIgnoreCase("Potência")) {
            simbolo = "^";
            resultado = Math.pow(n1, n2);

        } else {
            valida = false;
        }

        String[] resposta = new String[3];

        resposta[0] = simbolo;
        resposta[1] = String.valueOf(resultado);
        resposta[2] = String.valueOf(valida);

        return resposta;
    }

    public static void exibirResultado(String[] dados, String[] resposta) {
        if (resposta[2].equals("true")) {
            System.out.println(dados[0] + " " + resposta[0] + " " + dados[1] + " = " + resposta[1]);
        } else {
            System.out.println("Operação não suportada");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dados = coletarDados(sc);
        String[] resposta = processarDados(dados);
        exibirResultado(dados, resposta);

        sc.close();
    }
}