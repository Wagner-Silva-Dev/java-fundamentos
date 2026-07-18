package fundamentos.arquivos;

import java.io.*;
import java.util.Scanner;

public class DiarioDeAnotacoes {
    public static void main(String[] args) {
        File diario = new File("src\\fundamentos\\arquivos\\diario_anotacoes.txt");
        boolean existsDiario = diario.exists();

        if (!existsDiario) {
            try {
                boolean isDiarioCreate = diario.createNewFile();
                if (!isDiarioCreate) {
                    System.out.println("Erro ao criar o diário!");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Diario de anotações");

        try (FileReader fr = new FileReader(diario); BufferedReader br = new BufferedReader(fr)) {
            String linha;
            boolean temConteudo = false;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
                temConteudo = true;
            }
            System.out.println(temConteudo ? "Continue suas anotações" : "Digite suas anotações");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fw = new FileWriter(diario, true); BufferedWriter bw = new BufferedWriter(fw); Scanner scanner = new Scanner(System.in)) {
            do {
                String anotacao = scanner.nextLine();
                if (anotacao.equalsIgnoreCase("parar anotação")) {
                    System.out.println("Finalizando anotações");
                    break;
                }

                bw.write(anotacao);
                bw.newLine();
            } while (true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}