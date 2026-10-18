import java.util.Scanner;

public class Ex27_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Parâmetro inválido.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.printf("O fatorial de %d é %d.\n", numero, fatorial);
        }

        sc.close();
    }
}