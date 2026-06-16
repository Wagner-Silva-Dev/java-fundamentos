package fundamentos.classes.polimorfismo.laboratorio;

public abstract class Amostra {
    protected String id;
    protected String responsavel;

    public Amostra(String id, String responsavel) {
        this.id = id;
        this.responsavel = responsavel;
    }

    public abstract double calcularTempo();

    public String getId() {
        return id;
    }

    public String getResponsavel() {
        return responsavel;
    }
}
