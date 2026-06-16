package fundamentos.classes.polimorfismo.laboratorio;

public class AmostraQuimica extends Amostra {

    public AmostraQuimica(String id, String responsavel) {
        super(id, responsavel);
    }

    @Override
    public double calcularTempo() {
        return 45;
    }
}
