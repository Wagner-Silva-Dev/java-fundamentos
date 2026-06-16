package fundamentos.classes.polimorfismo.laboratorio;

public class AmostraBiologica extends Amostra {
    private final int contaminacao;

    public AmostraBiologica(String id, String responsavel, int contaminacao) {
        super(id, responsavel);
        this.contaminacao = contaminacao;
    }

    @Override
    public double calcularTempo() {
        return 30 + (contaminacao * 10);
    }
}