package fundamentos.classes.polimorfismo.laboratorio;

public class AmostraUrgente extends Amostra {
    private final double tempoBase;

    public AmostraUrgente(String id, String responsavel, double tempoBase) {
        super(id, responsavel);
        this.tempoBase = tempoBase;
    }

    @Override
    public double calcularTempo() {
        return tempoBase  * 0.6;
    }
}
