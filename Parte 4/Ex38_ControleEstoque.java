import java.util.Scanner;

public class Ex38_ControleEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[1000];
        int[] quantidades = new int[1000];
        int qtdProdutos = 0, opcao, numero, quantidade;

        do {
            System.out.println("\n===== CONTROLE DE ESTOQUE =====");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Realizar entrada no estoque");
            System.out.println("3. Realizar saída no estoque");
            System.out.println("4. Listar estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    if (qtdProdutos >= 1000) {
                        System.out.println("Limite de produtos atingido!");
                    } else {
                        System.out.print("Digite o nome do produto: ");
                        produtos[qtdProdutos] = sc.nextLine();

                        System.out.print("Digite a quantidade inicial: ");
                        quantidades[qtdProdutos] = sc.nextInt();

                        qtdProdutos++;
                        System.out.println("Produto adicionado com sucesso!");
                    }
                }

                case 2 -> {
                    if (qtdProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados!");
                    } else {
                        System.out.print("Digite o número do produto: ");
                        numero = sc.nextInt();

                        if (numero < 1 || numero > qtdProdutos) {
                            System.out.println("Produto inválido!");
                        } else {
                            System.out.print("Digite a quantidade de entrada: ");
                            quantidade = sc.nextInt();

                            if (quantidade > 0) {
                                quantidades[numero - 1] += quantidade;
                                System.out.println("Entrada realizada com sucesso!");
                            } else {
                                System.out.println("Quantidade inválida!");
                            }
                        }
                    }
                }

                case 3 -> {
                    if (qtdProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados!");
                    } else {
                        System.out.print("Digite o número do produto: ");
                        numero = sc.nextInt();

                        if (numero < 1 || numero > qtdProdutos) {
                            System.out.println("Produto inválido!");
                        } else {
                            System.out.print("Digite a quantidade de saída: ");
                            quantidade = sc.nextInt();

                            if (quantidade <= 0) {
                                System.out.println("Quantidade inválida!");
                            } else if (quantidade > quantidades[numero - 1]) {
                                System.out.println("Quantidade indisponível em estoque!");
                            } else {
                                quantidades[numero - 1] -= quantidade;
                                System.out.println("Saída realizada com sucesso!");
                            }
                        }
                    }
                }

                case 4 -> {
                    if (qtdProdutos == 0) {
                        System.out.println("Não existem produtos cadastrados!");
                    } else {
                        System.out.println("\n===== ESTOQUE ATUAL =====");
                        for (int i = 0; i < qtdProdutos; i++) {
                            System.out.printf("Produto %d: %s - %d unidades%n", i + 1, produtos[i], quantidades[i]);
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