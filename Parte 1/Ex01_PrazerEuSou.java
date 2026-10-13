import java.util.Locale;
import java.util.Scanner;

// 1. Faça um programa que apresente um estudante universitário considerando seu nome, curso que estuda, semestre atual e seu hobby favorito.
public class Ex01_PrazerEuSou {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        // Variáveis
        String nome;
        String curso;
        int semestre;
        String hobby;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite qual o curso que você está fazendo: ");
        curso = sc.nextLine();

        System.out.print("Digite apenas o número correspondente ao semestre em que você está no momento: ");
        semestre = sc.nextInt();

        sc.nextLine(); // Limpa o '\n' deixado pelo nextInt()

        System.out.print("Digite o seu hobby favorito: ");
        hobby = sc.nextLine();

        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Semestre atual: " + semestre + "° Semestre");
        System.out.println("Hobby: " + hobby);

        sc.close();
    }
}