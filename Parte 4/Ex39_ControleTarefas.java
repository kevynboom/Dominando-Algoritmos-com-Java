import java.util.Scanner;

public class Ex39_ControleTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tarefas = new String[100];
        boolean[] concluidas = new boolean[100];
        int qtdTarefas = 0, opcao, numero;

        do {
            System.out.println("\n===== CONTROLE DE TAREFAS =====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar concluída");
            System.out.println("4. Exibir pendentes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    if (qtdTarefas >= tarefas.length) {
                        System.out.println("Limite de tarefas atingido!");
                    } else {
                        System.out.print("Digite a descrição da tarefa: ");
                        tarefas[qtdTarefas] = sc.nextLine();
                        concluidas[qtdTarefas] = false;
                        qtdTarefas++;
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                }

                case 2 -> {
                    if (qtdTarefas == 0) {
                        System.out.println("Não existem tarefas cadastradas!");
                    } else {
                        System.out.println("\nLista de tarefas:");

                        for (int i = 0; i < qtdTarefas; i++) {
                            System.out.printf("%d - [%s] %s%n", i + 1, concluidas[i] ? "X" : " ", tarefas[i]);
                        }
                    }
                }

                case 3 -> {
                    if (qtdTarefas == 0) {
                        System.out.println("Não existem tarefas cadastradas!");
                    } else {
                        System.out.print("Digite o número da tarefa: ");
                        numero = sc.nextInt();

                        if (numero < 1 || numero > qtdTarefas) {
                            System.out.println("Número de tarefa inválido!");
                        } else if (concluidas[numero - 1]) {
                            System.out.println("Esta tarefa já foi concluída!");
                        } else {
                            concluidas[numero - 1] = true;
                            System.out.printf("Tarefa %d marcada como concluída.%n", numero);
                        }
                    }
                }

                case 4 -> {
                    if (qtdTarefas == 0) {
                        System.out.println("Não existem tarefas cadastradas!");
                    } else {
                        boolean existePendente = false;
                        System.out.println("\nTarefas pendentes:");

                        for (int i = 0; i < qtdTarefas; i++) {
                            if (!concluidas[i]) {
                                System.out.printf("%d - [ ] %s%n", i + 1, tarefas[i]);
                                existePendente = true;
                            }
                        }

                        if (!existePendente) {
                            System.out.println("Não existem tarefas pendentes!");
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