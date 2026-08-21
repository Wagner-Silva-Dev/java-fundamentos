package exercicios;

import exercicios.banco.ContaBancaria;
import exercicios.banco.Usuario;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("========================================");
            System.out.println("Bem vindo ao Sistema de Banco BlusField (Em ambiente de teste)");
            System.out.println("========================================");

            System.out.println("Primeiro vamos criar seu usuário");
            System.out.println("Digite o nome de usuário");
            String nomeUsuario = scanner.nextLine();

            while (nomeUsuario.isBlank()) {
                System.out.println("Nome de usuário não pode estar vazio. Tente novamente");
                nomeUsuario = scanner.nextLine();
            }

            Usuario usuario = new Usuario(nomeUsuario);
            System.out.println("Usuário " + nomeUsuario + " criado com sucesso");

            ContaBancaria contaBancaria = new ContaBancaria(usuario, 0);

            int opcao;

            do {
                System.out.println("Escolha uma opção");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Ver saldo");
                System.out.println("4 - Finalizar sistema");

                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Digite o valor a ser depositado");
                        try {
                            contaBancaria.depositarValor(scanner.nextDouble());
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage() + " operação cancelada, tente novamente mais tarde");
                        }
                    }

                    case 2 -> {
                        System.out.println("Digite o valor a ser sacado");
                        try {
                            contaBancaria.sacarValor(scanner.nextDouble());
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            System.out.println("Erro: " + e.getMessage() + " operação cancelada, tente novamente mais tarde");
                        }
                    }

                    case 3 -> {
                        System.out.println("Carregando o saldo atual da conta");
                        System.out.println("========================================");
                        System.out.println("Extrato Banco BlusField");
                        System.out.println("Nome: " + contaBancaria.getUsuario().getNomeUsuario());
                        System.out.println("========================================");
                        System.out.println("Saldo: " + contaBancaria.getSaldo());
                        System.out.println("========================================");
                    }

                    case 4 -> {
                        System.out.println("Obrigado pela ajuda, esperamos te ver novamente no futuro");
                        System.out.println("Finalizando sistema e limpando dados usados no teste");
                    }

                    default -> System.out.println("Opção invalida. Tente novamente");
                }
            } while (opcao != 4);
        }
    }
}