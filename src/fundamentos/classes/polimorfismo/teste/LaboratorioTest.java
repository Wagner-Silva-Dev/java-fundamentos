package fundamentos.classes.polimorfismo.teste;

import fundamentos.classes.polimorfismo.laboratorio.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaboratorioTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite o nome o usuário responsável:");
            String responsavel = scanner.nextLine();

            System.out.println("Qual amostra deseja cadastrar?");
            int count = 1;
            for (MenuAmostra menuAmostra : MenuAmostra.values()) {
                System.out.println(count++ + " - " + menuAmostra.getTipoAmostra());
            }

            int opcao = scanner.nextInt();

            System.out.println("Qual o id da amostra?");
            String id = scanner.next();

            List<Amostra> amostra = new ArrayList<>();
            switch (opcao) {
                case 1 -> amostra.add(new AmostraQuimica(id, responsavel));
                case 2 -> {
                    System.out.println("Qual o nível de contaminação?");
                    int contaminacao = scanner.nextInt();
                    amostra.add(new AmostraBiologica(id, responsavel, contaminacao));
                }
                case 3 -> {
                    System.out.println("Qual o tempo base da amostra?");
                    double tempoBase = scanner.nextDouble();
                    amostra.add(new AmostraUrgente(id, responsavel, tempoBase));
                }
                default -> System.out.println("Opção não cadastrada!");

            }

            for (Amostra viewAmostra : amostra) {
                System.out.println("ID : " + viewAmostra.getId());

                if (viewAmostra instanceof AmostraUrgente) {
                    System.out.println("Amostra Urgente Detectada! Tempo reduzido em 40%");
                }

                System.out.println("Tempo : " + viewAmostra.calcularTempo());
            }
        }
    }
}
