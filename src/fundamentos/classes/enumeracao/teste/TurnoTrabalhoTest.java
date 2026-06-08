package fundamentos.classes.enumeracao.teste;

import fundamentos.classes.enumeracao.TurnoTrabalho;

import java.util.Scanner;

public class TurnoTrabalhoTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Turnos disponíveis");
            for (TurnoTrabalho turnoTrabalho : TurnoTrabalho.values()) {
                System.out.println(turnoTrabalho + " - " +turnoTrabalho.getHorario());
            }

            System.out.println("---------------------------------");
            System.out.println("Qual foi o seu horário de entrada?");
            String horarioEntrada = scanner.nextLine();

            TurnoTrabalho TurnoEncontrado = null;
            for  (TurnoTrabalho turno : TurnoTrabalho.values()) {
                if(turno.getHorario().equals(horarioEntrada)) {
                    TurnoEncontrado = turno;
                    break;
                }
            }

            if(TurnoEncontrado == null) {
                System.out.println("Horário não encontrado");
            } else  {
                System.out.println(TurnoEncontrado + " - " + TurnoEncontrado.getHorario() + " - Bônus de " + TurnoEncontrado.getAdicional());
            }

        }
    }
}
