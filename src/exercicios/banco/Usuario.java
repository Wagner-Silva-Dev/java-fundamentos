package exercicios.banco;

public class Usuario {
    private String nomeUsuario;

    public Usuario(String nomeUsuario) {
        setNomeUsuario(nomeUsuario);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        if (nomeUsuario == null || nomeUsuario.isBlank()) {
            throw new IllegalArgumentException("Nome usuário não pode estar em branco");
        }
        this.nomeUsuario = nomeUsuario;
    }
}
