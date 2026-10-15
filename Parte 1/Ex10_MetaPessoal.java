import java.util.Locale;
import java.util.Scanner;

public class Ex10_MetaPessoal {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        String descricaoMeta;

        float valorMeta;
        float salario;
        float despesas;
        float valorRestante;
        float economiaFixa;
        float valorMensal;
        float tempo;

        System.out.println("--- Meta Pessoal ---");
        System.out.print("Digite a descrição da meta: ");
        descricaoMeta = sc.nextLine();

        System.out.print("Digite o valor necessário para atingir a meta: R$");
        valorMeta = sc.nextFloat();

        System.out.print("Digite o seu salário mensal: R$");
        salario = sc.nextFloat();

        System.out.print("Digite o total das despesas mensais: R$");
        despesas = sc.nextFloat();

        valorRestante = salario - despesas; // Calculando o valor restante após as despesas
        economiaFixa = valorRestante * 30 / 100; // Reservando 30% do valor restante como economia fixa
        valorMensal = valorRestante - economiaFixa; // O restante poderá ser destinado à meta
        tempo = valorMeta / valorMensal; // Calculando o tempo necessário para alcançar a meta

        System.out.println("\n--- Resultado ---");
        System.out.println("Meta: " + descricaoMeta);
        System.out.printf("Valor da meta: R$%.2f%n", valorMeta);
        System.out.printf("Valor reservado para economia: R$%.2f%n", economiaFixa);
        System.out.printf("Valor destinado à meta por mês: R$%.2f%n", valorMensal);
        System.out.printf("Tempo para alcançar a meta: %.2f meses%n", tempo);

        sc.close();
    }
}