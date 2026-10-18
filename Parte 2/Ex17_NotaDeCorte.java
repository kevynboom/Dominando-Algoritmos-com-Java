import java.util.Scanner;

public class Ex17_NotaDeCorte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do candidato: ");
        double notaCandidato = sc.nextDouble();
        
        System.out.print("Digite a nota de corte: ");
        double notaCorte = sc.nextDouble();

        System.out.print("Digite a nota mínima para aprovação: ");
        double notaMinima = sc.nextDouble();

        System.out.println("Situação candidato:");

        if (notaCandidato >= notaMinima) {
            System.out.println("Aprovado");
        } else if (notaCandidato < notaCorte) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Lista de Espera");
        }

        sc.close();
    }
}