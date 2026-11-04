import java.util.Scanner;

public class Ex38_ControleEstoque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[1000];
        int[] quantidades = new int[1000];
        int qtdProdutos = 0;
        int opcao;

        do {
            System.out.println("\nMenu de Opções");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Realizar entrada no estoque");
            System.out.println("3. Realizar saída no estoque");
            System.out.println("4. Listar estoque");
            System.out.println("0. Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    if (qtdProdutos < 1000) {
                        produtos[qtdProdutos] = sc.next();
                        quantidades[qtdProdutos] = sc.nextInt();
                        qtdProdutos++;
                        
                        System.out.println("Produto adicionado com sucesso!");
                    } else {
                        System.out.println("Limite de produtos atingido!");
                    }
                }
                case 2 -> {
                    if (qtdProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados!");
                    } else {
                        int produto = sc.nextInt();
                        int quantidade = sc.nextInt();
                        
                        if (produto >= 1 && produto <= qtdProdutos) {
                            quantidades[produto - 1] += quantidade;
                            
                            System.out.println("Entrada realizada com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado!");
                        }
                    }
                }
                case 3 -> {
                    if (qtdProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados!");
                    } else {
                        int produto = sc.nextInt();
                        int quantidade = sc.nextInt();
                        
                        if (produto >= 1 && produto <= qtdProdutos) {
                            if (quantidade <= quantidades[produto - 1] && quantidade > 0) {
                                quantidades[produto - 1] -= quantidade;
                                System.out.println("Saída realizada com sucesso!");
                            } else {
                                System.out.println("Quantidade indisponível no estoque!");
                            }
                        } else {
                            System.out.println("Produto não encontrado!");
                        }
                    }
                }
                case 4 -> {
                    if (qtdProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados!");
                    } else {
                        System.out.println("Estoque atual:");
                        
                        for (int i = 0; i < qtdProdutos; i++) {
                            System.out.println("Produto " + (i + 1) + ": " + produtos[i] + " - " + quantidades[i] + " unidades");
                        }
                    }
                }
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}