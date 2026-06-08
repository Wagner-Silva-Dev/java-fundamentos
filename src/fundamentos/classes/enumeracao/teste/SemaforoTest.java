package fundamentos.classes.enumeracao.teste;

import fundamentos.classes.enumeracao.Semaforo;

import java.util.Scanner;

public class SemaforoTest {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Cores disponiveis: ");
            for (Semaforo semaforo : Semaforo.values()) {
                System.out.print(semaforo + " ");
            }
            System.out.println();

            System.out.println("Qual a cor do semaforo?");
            String cor = scanner.nextLine();

            Semaforo semaforo = Semaforo.valueOf(cor.toUpperCase());

            System.out.println(semaforo.getMensagem());
        } catch (IllegalArgumentException e) {
            System.out.println("Cor invalida");
        }

    }
}
