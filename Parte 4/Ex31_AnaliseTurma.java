import java.util.Scanner;

public class Ex31_AnaliseTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int n = sc.nextInt();

        double[] notas = new double[n];
        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a nota do aluno %d (0 a 10): ", (i + 1));
            notas[i] = sc.nextDouble();
            soma += notas[i];

            if (notas[i] >= 6.0) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 1; i < n; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = soma / n;

        System.out.println("\n>> Resultado da Turma <<");
        System.out.print("Notas informadas: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.0f", notas[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.printf("Média da turma: %.0f\n", media);
        System.out.printf("Maior nota: %.0f\n", maior);
        System.out.printf("Menor nota: %.0f\n", menor);
        System.out.printf("Aprovados: %d\n", aprovados);
        System.out.printf("Reprovados: %d\n", reprovados);

        if (aprovados == n) {
            System.out.println("Situação geral: Todos os alunos foram aprovados");
        } else {
            System.out.println("Situação geral: Nem todos os alunos foram aprovados");
        }

        sc.close();
    }
}