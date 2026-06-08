package fundamentos.classes.enumeracao;

public enum TurnoTrabalho {
    MATUTINO("06:00-14:00" ,"0%"),
    VESPERTINO("14:00-22:00", "15%"),
    NOTURNO("22:00-06:00", "35%");

    private final String horario;
    private final String adicional;

    TurnoTrabalho(String horario, String adicional) {
       this.horario = horario;
       this.adicional = adicional;
    }

    public String getHorario() {
        return horario;
    }

    public String getAdicional() {
        return adicional;
    }

}