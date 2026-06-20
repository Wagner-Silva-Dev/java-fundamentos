package exercicios.colaborador;

public class ColaboradorComissionado extends Colaborador {
    private final int vendas;
    private final double porcentagemComissao;

    public ColaboradorComissionado(int id, String nome, int vendas, double porcentagemComissao) {
        super(id, nome);
        this.vendas = vendas;
        this.porcentagemComissao = porcentagemComissao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nVendas realizadas: " + vendas +
                "\nPorcentagem da comissão: " + porcentagemComissao +
                "\nSalário Final: " + calcularSalario();
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + (vendas * porcentagemComissao / 100);
    }

    public int getVendas() {
        return vendas;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

}
