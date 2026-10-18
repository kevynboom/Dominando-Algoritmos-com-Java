import java.util.Scanner;

public class Ex23_ControleDeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double temp;
        double maior = 0;
        double menor = 0;
        boolean primeiraValida = false;

        do {
            System.out.print("Digite a temperatura (0 para sair): ");
            temp = sc.nextDouble();

            if (temp == 0) {
                break;
            }

            if (temp < -50 || temp > 60) {
                System.out.println("Temperatura inválida");
            } else {
                if (!primeiraValida) {
                    maior = temp;
                    menor = temp;
                    primeiraValida = true;
                } else {
                    if (temp > maior) {
                        maior = temp;
                    }
                    if (temp < menor) {
                        menor = temp;
                    }
                }
            }
        } while (true);

        if (primeiraValida) {
            System.out.printf("Maior temperatura: %.0f\n", maior);
            System.out.printf("Menor temperatura: %.0f\n", menor);
        }

        // Talvez seria mais fácil com vetores XD
        sc.close();
    }
}