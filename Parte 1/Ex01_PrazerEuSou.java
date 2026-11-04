import java.util.Scanner;

public class Ex01_PrazerEuSou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, curso, hobby;
        int semestre;

        System.out.println("--- Prazer, Eu Sou... ---");
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite qual o curso que você está fazendo: ");
        curso = sc.nextLine();

        System.out.print("Digite apenas o número correspondente ao semestre em que você está no momento: ");
        semestre = sc.nextInt();

        sc.nextLine();
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