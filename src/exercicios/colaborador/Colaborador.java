package exercicios.colaborador;

public abstract class Colaborador {
    protected final int id;
    protected final String nome;
    protected static final double SALARIO_BASE = 2000.0;

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\nSalário Base: " + SALARIO_BASE;
    }

    public Colaborador(int id, String nome) {
        if (nome == null || nome.isBlank()) {
            throw new DadosInvalidosException("Nome não pode ser vazio");
        }

        if (id < 0) {
            throw new DadosInvalidosException("ID não pode ser negativo");
        }

        this.id = id;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return SALARIO_BASE;
    }
}
