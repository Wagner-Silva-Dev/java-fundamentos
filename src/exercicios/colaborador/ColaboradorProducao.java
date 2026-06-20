package exercicios.colaborador;

public class ColaboradorProducao extends Colaborador {
    private final int pecasProduzidas;
    private final double ganhoPorPeca;

    public ColaboradorProducao(int id, String nome, int pecasProduzidas, double ganhoPorPeca) {
        super(id, nome);
        this.pecasProduzidas = pecasProduzidas;
        this.ganhoPorPeca = ganhoPorPeca;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPeças produzidas: " + pecasProduzidas +
                "\nGanho por peça: " + ganhoPorPeca +
                "\nSalário Final: " + calcularSalario();
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + (pecasProduzidas * ganhoPorPeca);
    }

    public int getPecasProduzidas() {
        return pecasProduzidas;
    }

    public double getGanhoPorPeca() {
        return ganhoPorPeca;
    }

}
