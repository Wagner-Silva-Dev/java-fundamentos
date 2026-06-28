package exercicios;

import exercicios.colaborador.*;

import java.util.*;

public class CadastroColaborador {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            List<Colaborador> listaColaboradores = new ArrayList<>();
            do {
                exibirmenu();
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1 -> cadastraColaboradorComum(scanner, listaColaboradores);
                    case 2 -> cadastraColaboradorComissionado(scanner, listaColaboradores);
                    case 3 -> cadastraColaboradorProducao(scanner, listaColaboradores);
                    case 4 -> exibirFolhaPagamento(listaColaboradores);
                    case 0 -> {
                        System.out.println("Finalizando sistema...");
                        return;
                    }
                }
            } while (true);
        }
    }

    public static void exibirmenu() {
        System.out.println("Informe que tipo de cadastro você quer fazer: ");
        System.out.println("Opção 1: Cadastro de Colaborador Padrão");
        System.out.println("Opção 2: Cadastro de Colaborador Comissionado.");
        System.out.println("Opção 3: Cadastro de Colaborador de Produção.");
        System.out.println("Opção 4: Gerar Folha de Pagamento.");
        System.out.println("Opção 0: Fechar sistema.");
    }

    public static void cadastraColaboradorComum(Scanner scanner, List<Colaborador> listaColaboradores) {
        System.out.println("\n--- CADASTRANDO COLABORADOR COMUM ---");
        do {
            boolean corrigirCadastro = false;
            do {
                System.out.println("Informe o nome do colaborador: ");
                String nomeColaborador = scanner.nextLine();

                System.out.println("Insira o id do colaborador: ");
                int idColaborador = scanner.nextInt();
                scanner.nextLine();

                try {
                    listaColaboradores.add(new ColaboradorComum(idColaborador, nomeColaborador));
                } catch (DadosInvalidosException e) {
                    System.out.println("Erro ao cadastrar colaborador: " + e.getMessage());
                    corrigirCadastro = perguntaSeCorrigirCadastroColaborador(scanner);
                }

            } while (corrigirCadastro);
        } while (perguntaSeContinuar(scanner));
    }

    public static void cadastraColaboradorComissionado(Scanner scanner, List<Colaborador> listaColaboradores) {
        System.out.println("\n--- CADASTRANDO COLABORADOR COMISSIONADO  ---");
        do {
            boolean corrigirCadastro = false;
            do {
                System.out.println("Informe o nome do colaborador: ");
                String nomeColaborador = scanner.nextLine();

                System.out.println("Insira o id do colaborador: ");
                int idColaborador = scanner.nextInt();

                System.out.println("Quantas vendas foram realizadas pelo colaborador?");
                int qtdeVendas = scanner.nextInt();

                System.out.println("Qual a % que o colaborador vai receber das vendas?");
                double porcentagemComissao = scanner.nextDouble();
                scanner.nextLine();

                try {
                    listaColaboradores.add(new ColaboradorComissionado(idColaborador, nomeColaborador, qtdeVendas, porcentagemComissao));
                } catch (DadosInvalidosException e) {
                    System.out.println("Erro ao cadastrar colaborador: " + e.getMessage());
                    corrigirCadastro = perguntaSeCorrigirCadastroColaborador(scanner);
                }

            } while (corrigirCadastro);
        } while (perguntaSeContinuar(scanner));
    }

    public static void cadastraColaboradorProducao(Scanner scanner, List<Colaborador> listaColaboradores) {
        System.out.println("\n---  CADASTRANDO COLABORADOR DE PRODUÇÃO  ---");
        do {
            boolean corrigirCadastro = false;
            do {
                System.out.println("Informe o nome do colaborador: ");
                String nomeColaborador = scanner.nextLine();

                System.out.println("Insira o id do colaborador: ");
                int idColaborador = scanner.nextInt();

                System.out.println("Quantas peças foram produzidas pelo colaborador?");
                int pecasProduzidas = scanner.nextInt();

                System.out.println("Qual o valor que o colaborador vai receber das peças produzidas?");
                double ganhoPorPeca = scanner.nextDouble();
                scanner.nextLine();

                try {
                    listaColaboradores.add(new ColaboradorProducao(idColaborador, nomeColaborador, pecasProduzidas, ganhoPorPeca));
                } catch (DadosInvalidosException e) {
                    System.out.println("Erro ao cadastrar colaborador: " + e.getMessage());
                    corrigirCadastro = perguntaSeCorrigirCadastroColaborador(scanner);
                }

            } while (corrigirCadastro);
        } while (perguntaSeContinuar(scanner));
    }

    public static void exibirFolhaPagamento(List<Colaborador> listaColaboradores) {
        System.out.println("\n========== FOLHA DE PAGAMENTO ==========");
        if (listaColaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado até o momento.");
            System.out.println("========================================\n");
        } else {
            for (Colaborador colaborador : listaColaboradores) {
                System.out.println(colaborador);
                System.out.println("========================================\n");
            }
        }
    }

    private static boolean perguntaSeContinuar(Scanner scanner) {
        String resposta;
        do {
            System.out.println("Deseja cadastrar um novo colaborador? (S/N)");
            resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Resposta inválida! Digite S ou N para continuar.");
            }

        } while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N"));

        return resposta.equalsIgnoreCase("S");
    }

    private static boolean perguntaSeCorrigirCadastroColaborador(Scanner scanner) {
        String resposta;
        do {
            System.out.println("Deseja corrigir o cadastro do colaborador? (S/N)");
            resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Resposta inválida! Digite S ou N para continuar.");
            }

            if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Colaborador com erro não cadastrado!");
            }

        } while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N"));

        return resposta.equalsIgnoreCase("S");
    }
}