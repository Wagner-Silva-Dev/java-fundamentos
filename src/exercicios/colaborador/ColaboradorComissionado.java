package exercicios.colaborador;

public class ColaboradorComissionado extends Colaborador {
    private final int vendas;
    private final double porcentagemComissao;

    public ColaboradorComissionado(int id, String nome, int vendas, double porcentagemComissao) {
        super(id, nome);
        if  (vendas < 0) {
            throw new DadosInvalidosException("Vendas não pode ser negativo");
        }

        if   (porcentagemComissao < 0) {
            throw new DadosInvalidosException("Porcentagem da comissão não pode ser negativo");
        }

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
