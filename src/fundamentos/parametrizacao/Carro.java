package fundamentos.parametrizacao;

public class Carro {
    private String nome;
    private String cor;
    private int ano;

    public Carro(String nome, String cor, int ano) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
}
