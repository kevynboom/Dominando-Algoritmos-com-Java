import java.util.Scanner;

public class Ex49_ControleEstoque {
    static int coletarOpcao(Scanner sc) {
        exibirMenu();
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(sc.nextLine());
    }

    static void exibirMenu() {
        System.out.println("\nMenu de Opções");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Realizar entrada no estoque");
        System.out.println("3. Realizar saída no estoque");
        System.out.println("4. Listar estoque");
        System.out.println("0. Sair");
    }

    static String coletarNome(Scanner sc) {
        System.out.print("Digite o nome do produto: ");
        return sc.nextLine();
    }

    static int coletarQuantidade(Scanner sc) {
        System.out.print("Digite a quantidade: ");
        return Integer.parseInt(sc.nextLine());
    }

    static int coletarProduto(Scanner sc) {
        System.out.print("Digite o número do produto: ");
        return Integer.parseInt(sc.nextLine());
    }

    static int processarCadastro(String[] nomes, int[] quantidades, int total, String nome, int quantidade) {
        if (total >= 1000) return -1;

        nomes[total] = nome;
        quantidades[total] = quantidade;

        return total + 1;
    }

    static boolean processarEntrada(int[] quantidades, int produto, int quantidade, int total) {
        if (produto < 1 || produto > total || quantidade <= 0) return false;

        quantidades[produto - 1] += quantidade;
        return true;
    }

    static int processarSaida(int[] quantidades, int produto, int quantidade, int total) {
        if (produto < 1 || produto > total || quantidade <= 0) return -1;
        if (quantidade > quantidades[produto - 1]) return -2;

        quantidades[produto - 1] -= quantidade;
        return 1;
    }

    static void exibirEstoque(String[] nomes, int[] quantidades, int total) {
        if (total == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("Estoque atual:");

        for (int i = 0; i < total; i++) {
            System.out.printf("Produto %d: %s - %d unidades%n", i + 1, nomes[i], quantidades[i]);
        }
    }

    static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[1000];
        int[] quantidades = new int[1000];
        int total = 0, opcao;

        do {
            opcao = coletarOpcao(sc);

            switch (opcao) {
                case 1 -> {
                    if (total >= 1000) {
                        exibirMensagem("Limite de produtos atingido.");
                    } else {
                        String nome = coletarNome(sc);
                        int quantidade = coletarQuantidade(sc);

                        if (nome.isBlank() || quantidade < 0) {
                            exibirMensagem("Dados inválidos.");
                        } else {
                            total = processarCadastro(nomes, quantidades, total, nome, quantidade);
                            exibirMensagem("Produto adicionado com sucesso!");
                        }
                    }
                }
                case 2 -> {
                    if (total == 0) {
                        exibirMensagem("Nenhum produto cadastrado.");
                    } else {
                        exibirEstoque(nomes, quantidades, total);
                        int produto = coletarProduto(sc);
                        int quantidade = coletarQuantidade(sc);

                        if (processarEntrada(quantidades, produto, quantidade, total)) {
                            exibirMensagem("Entrada realizada com sucesso!");
                        } else {
                            exibirMensagem("Dados inválidos.");
                        }
                    }
                }
                case 3 -> {
                    if (total == 0) {
                        exibirMensagem("Nenhum produto cadastrado.");
                    } else {
                        exibirEstoque(nomes, quantidades, total);
                        int produto = coletarProduto(sc);
                        int quantidade = coletarQuantidade(sc);
                        int resultado = processarSaida(quantidades, produto, quantidade, total);

                        switch (resultado) {
                            case 1 -> exibirMensagem("Saída realizada com sucesso!");
                            case -2 -> exibirMensagem("Quantidade insuficiente em estoque.");
                            default -> exibirMensagem("Dados inválidos.");
                        }
                    }
                }
                case 4 -> exibirEstoque(nomes, quantidades, total);
                case 0 -> exibirMensagem("Encerrando o programa...");
                default -> exibirMensagem("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}