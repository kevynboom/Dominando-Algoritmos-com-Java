import java.util.Scanner;

public class Ex19_MensalidadeUniversidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a sigla do curso: ");
        String curso = sc.nextLine();
        
        System.out.print("É isento (sim ou não)? ");
        String isento = sc.nextLine();
        
        System.out.print("Digite o desconto em (%): ");
        double desconto = sc.nextDouble();

        double valor = 0;
        boolean encontrado = true;

        if (curso.equalsIgnoreCase("SI")) {
            valor = 900.00;
        } else if (curso.equalsIgnoreCase("ADS")) {
            valor = 750.00;
        } else if (curso.equalsIgnoreCase("CS")) {
            valor = 1150.00;
        } else if (curso.equalsIgnoreCase("EC")) {
            valor = 1300.00;
        } else if (curso.equalsIgnoreCase("ES")) {
            valor = 950.00;
        } else {
            encontrado = false;
        }

        if (!encontrado) {
            System.out.println("Curso não encontrado");
        } else {
            if (isento.equalsIgnoreCase("Sim")) {
                valor = 0.0;
            } else if (desconto > 0) {
                valor = valor - (valor * (desconto / 100.0));
            }
            System.out.printf("Valor da mensalidade:\nR$ %.2f\n", valor);
        }

        sc.close();
    }
}