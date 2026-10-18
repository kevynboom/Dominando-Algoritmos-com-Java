import java.util.Scanner;

public class Ex14_SorveteriaEmPromocao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso em gramas: ");
        double gramas = sc.nextDouble();

        if (gramas <= 0) {
            System.out.println("Peso Inválido");
        } else {
            double total = (gramas / 100.0) * (gramas >= 1000 ? 3.00 : 3.50);
            System.out.printf("O total é R$ %.2f\n", total);
        }

        sc.close();
    }
}