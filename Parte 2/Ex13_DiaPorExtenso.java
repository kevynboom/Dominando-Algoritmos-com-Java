import java.util.Scanner;

public class Ex13_DiaPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();

        switch (dia) {
            case 0 -> System.out.println("Domingo");
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            default -> System.out.println("Dia da semana inválido");
        }

        sc.close();
    }
}