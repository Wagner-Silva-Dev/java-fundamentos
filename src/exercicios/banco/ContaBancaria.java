package exercicios.banco;

public class ContaBancaria {
    private final Usuario usuario;
    private double saldo;

    public ContaBancaria(Usuario usuario, double saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public void depositarValor(double valorDeposito){
        if (valorDeposito < 0){
            throw new IllegalArgumentException("Valor de deposito não pode ser menor que zero.");
        }
        this.saldo = saldo + valorDeposito;
    }

    public void sacarValor(double valorSacar){
        if (valorSacar < 0){
            throw new IllegalArgumentException("Valor a sacar tem que ser maior que zero.");
        }

        if  (this.saldo < valorSacar){
            throw new IllegalStateException("Valor a sacar maior que o saldo");
        }

        this.saldo = saldo - valorSacar;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
