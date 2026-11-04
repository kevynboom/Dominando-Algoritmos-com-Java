import java.util.Scanner;

public class Ex49_ControleEstoque {
    static Scanner sc = new Scanner(System.in);
    static String[] produtos = new String[1000];
    static int[] quantidades = new int[1000];
    static int qtdProdutos = 0;
    static int opcao, produto, quantidade;

    public static void coletarDados() {
        opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            if (qtdProdutos < 1000) {
                produtos[qtdProdutos] = sc.nextLine();
                quantidades[qtdProdutos] = sc.nextInt();
            }
        } else if (opcao == 2 || opcao == 3) {
            produto = sc.nextInt();
            quantidade = sc.nextInt();
        }
    }

    public static void processarDados() {
        if (opcao == 1) {
            if (qtdProdutos < 1000) {
                qtdProdutos++;
                System.out.println("Produto adicionado com sucesso!");
            } else {
                System.out.println("Limite de produtos atingido!");
            }
        } else if (opcao == 2) {
            if (qtdProdutos == 0) {
                System.out.println("Nenhum produto cadastrado!");
            } else if (produto < 1 || produto > qtdProdutos || quantidade <= 0) {
                System.out.println("Dados inválidos!");
            } else {
                quantidades[produto - 1] += quantidade;
                System.out.println("Entrada realizada com sucesso!");
            }
        } else if (opcao == 3) {
            if (qtdProdutos == 0) {
                System.out.println("Nenhum produto cadastrado!");
            } else if (produto < 1 || produto > qtdProdutos || quantidade <= 0) {
                System.out.println("Dados inválidos!");
            } else if (quantidade > quantidades[produto - 1]) {
                System.out.println("Quantidade insuficiente em estoque!");
            } else {
                quantidades[produto - 1] -= quantidade;
                System.out.println("Saída realizada com sucesso!");
            }
        } else if (opcao == 4) {
            if (qtdProdutos == 0) {
                System.out.println("Nenhum produto cadastrado!");
            } else {
                System.out.println("Estoque atual:");
                for (int i = 0; i < qtdProdutos; i++) {
                    System.out.println("Produto " + (i + 1) + ": " + produtos[i] + " - " + quantidades[i] + " unidades");
                }
            }
        } else if (opcao != 0) {
            System.out.println("Opção inválida!");
        }
    }

    public static void exibirResultado() {
        if (opcao == 0) {
            System.out.println("Encerrando o programa...");
        }
    }

    public static void main(String[] args) {
        do {
            coletarDados();
            processarDados();
            exibirResultado();
        } while (opcao != 0);
    }
}