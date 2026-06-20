package exercicios.colaborador;

public class ColaboradorComum extends Colaborador {

    public ColaboradorComum(int id, String nome) {
        super(id, nome);
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE;
    }

}
