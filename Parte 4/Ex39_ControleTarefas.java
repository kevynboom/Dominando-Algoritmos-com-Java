import java.util.Scanner;

public class Ex39_ControleTarefas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tarefas = new String[1000];
        boolean[] concluidas = new boolean[1000];
        int qtdTarefas = 0;
        int opcao;

        do {
            System.out.println("\nMenu de Opções");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar concluída");
            System.out.println("4. Exibir pendentes");
            System.out.println("0. Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    if (qtdTarefas < 1000) {
                        tarefas[qtdTarefas] = sc.nextLine();
                        concluidas[qtdTarefas] = false;
                        
                        qtdTarefas++;
                        
                        System.out.println("Tarefa adicionada com sucesso!");
                    } else {
                        System.out.println("Limite de tarefas atingido!");
                    }
                }
                case 2 -> {
                    if (qtdTarefas == 0) {
                        System.out.println("Não existem tarefas cadastradas!");
                    } else {
                        System.out.println("Lista de tarefas:");
                        
                        for (int i = 0; i < qtdTarefas; i++) {
                            
                            if (concluidas[i]) {
                                System.out.println((i + 1) + " - [X] " + tarefas[i]);
                            } else {
                                System.out.println((i + 1) + " - [ ] " + tarefas[i]);
                            }
                        }
                    }
                }
                case 3 -> {
                    if (qtdTarefas == 0) {
                        System.out.println("Não existem tarefas cadastradas!");
                    } else {
                        int numero = sc.nextInt();
                        
                        if (numero >= 1 && numero <= qtdTarefas) {
                            
                            if (!concluidas[numero - 1]) {
                                concluidas[numero - 1] = true;
                                System.out.println("Tarefa " + numero + " marcada como concluída.");
                            } else {
                                System.out.println("Essa tarefa já está concluída!");
                            }
                            
                        } else {
                            System.out.println("Número de tarefa inválido!");
                        }
                    }
                }
                case 4 -> {
                    if (qtdTarefas == 0) {
                        System.out.println("Não existem tarefas cadastradas!");
                    } else {
                        System.out.println("Tarefas pendentes:");
                        
                        boolean existePendente = false;
                        
                        for (int i = 0; i < qtdTarefas; i++) {
                            
                            if (!concluidas[i]) {
                                System.out.println((i + 1) + " - [ ] " + tarefas[i]);
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