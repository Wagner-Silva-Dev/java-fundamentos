package exercicios.colaborador;

public abstract class Colaborador {
    protected int id;
    protected String nome;
    protected static final double SALARIO_BASE = 2000.0;

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\nSalário Base: " + SALARIO_BASE;
    }

    public Colaborador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return SALARIO_BASE;
    }
}
