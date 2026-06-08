package fundamentos.classes.enumeracao;

public enum Semaforo {
    VERDE("Pode seguir"),
    AMARELO("Reduza a velocidade"),
    VERMELHO("PARE!!!");

    private final String mensagem;

    Semaforo(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
