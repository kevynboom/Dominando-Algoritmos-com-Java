import java.util.Scanner;

public class Ex15_BoletimAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();
        
        System.out.print("Digite a quantidade de faltas: ");
        int faltas = sc.nextInt();

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10 || faltas < 0) {
            System.out.println("Parâmetros inválidos");
        } else {
            double media = (nota1 + nota2 + nota3) / 3.0;
            System.out.printf("Média: %.1f.\n", media);

            if (faltas > 4) {
                System.out.println("Situação: Reprovado por Falta");
            } else if (media == 0) {
                System.out.println("Situação: Desistente");
            } else if (media >= 8 && media <= 10) {
                System.out.println("Situação: Aprovado com sucesso");
            } else if (media >= 6 && media < 8) {
                System.out.println("Situação: Aprovado");
            } else if (media < 6) {
                System.out.println("Situação: Recuperação");
            }
        }

        sc.close();
    }
}