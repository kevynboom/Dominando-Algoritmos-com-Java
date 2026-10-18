import java.util.Scanner;

public class Ex07_VoceLeRapido {
    public static void main(String[] args) {
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