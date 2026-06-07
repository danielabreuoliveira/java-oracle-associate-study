package academy.javaoca.danieloliveira.fundamentos.pacotes.cliente;

public class Cliente {

    private String titular;
    private double saldo;

    public Cliente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = "JOAO";
    }
}
