package fundamentos.classes.polimorfismo.laboratorio;

public enum MenuAmostra {
    AMOSTRA_QUIMICA("Amostra Química"),
    AMOSTRA_BIOLOGICA("Amostra Biológica"),
    AMOSTRA_URGENTE("Amostra Urgente"),;

    private final String tipoAmostra;
    MenuAmostra(String tipoAmostra) {
        this.tipoAmostra = tipoAmostra;
    }

    public String getTipoAmostra() {
        return tipoAmostra;
    }
}