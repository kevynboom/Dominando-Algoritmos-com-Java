import java.util.Locale;
import java.util.Scanner;

// 7. Faça um programa que calcule o tempo que um livro será lido por uma pessoa a partir do nome do livro, do total de páginas e do tempo em segundos de leitura por página.
public class Ex07_VoceLeRapido {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        String nomeLivro;
        int paginas;
        int segundosPorPagina;
        int tempoTotal;

        System.out.println("--- Tempo de Leitura ---");
        System.out.print("Digite o nome do livro: ");
        nomeLivro = sc.nextLine();

        System.out.print("Digite o total de páginas: ");
        paginas = sc.nextInt();

        System.out.print("Digite o tempo em segundos para ler cada página: ");
        segundosPorPagina = sc.nextInt();

        tempoTotal = paginas * segundosPorPagina; // Calculando o tempo total de leitura

        System.out.println("\n--- Resultado ---");
        System.out.println("Livro: " + nomeLivro);
        System.out.println("Total de páginas: " + paginas);
        System.out.println("Tempo por página: " + segundosPorPagina + " segundos");
        System.out.println("Tempo total de leitura: " + tempoTotal + " segundos");

        sc.close();
    }
}