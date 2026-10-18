import java.text.Normalizer;
import java.util.Scanner;

public class Ex18_CalculadoraComMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CALCULADORA ---");
        System.out.println("Operações aceitas:\nSoma(+), subtração(-), multiplicacao(*), divisão(/), resto(%) e potência(^)\n");

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        sc.nextLine(); // Limpando buffer

        System.out.print("Digite a operação: ");
        String op = sc.nextLine();
        
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        // Pesquisei como normalizar porque não queria fazer um switch-case para cada tipo de escrita
        String opNormalizada = Normalizer.normalize(op, Normalizer.Form.NFD)
                                        .replaceAll("\\p{M}", "")
                                        .toLowerCase()
                                        .trim();

        switch (opNormalizada) {
            case "+", "soma" -> System.out.printf("%.2f + %.2f = %.2f\n", n1, n2, (n1 + n2));
            case "-", "subtracao" -> System.out.printf("%.2f - %.2f = %.2f\n", n1, n2, (n1 - n2));
            case "*", "multiplicacao" -> System.out.printf("%.2f * %.2f = %.2f\n", n1, n2, (n1 * n2));
            case "/", "divisao" -> System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, (n1 / n2));
            case "%", "resto" -> System.out.printf("%.2f %% %.2f = %.2f\n", n1, n2, (n1 % n2));
            case "^", "potencia" -> System.out.printf("%.2f ^ %.2f = %.2f\n", n1, n2, Math.pow(n1, n2));
            default -> System.out.println("Operação não suportada");
        }

        sc.close();
    }
}