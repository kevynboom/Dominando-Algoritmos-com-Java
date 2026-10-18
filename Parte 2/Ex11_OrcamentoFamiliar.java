import java.util.Scanner;

public class Ex11_OrcamentoFamiliar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total de ganhos: ");
        double ganhos = sc.nextDouble();

        System.out.print("Digite o total de gastos: ");
        double gastos = sc.nextDouble();

        if (ganhos >= gastos) {
            System.out.println("Você está dentro do orçamento!");
        } else {
            System.out.println("Você está fora do orçamento! Não gaste mais!");
        }

        sc.close();
    }
}
