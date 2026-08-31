package academy.javaoca.danieloliveira.poo.review.teste2;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        System.out.println("Realizando o deposito no valor de: " + valor);
        System.out.println("Saldo na conta: ");
        return saldo += valor;
    }

    public double sacar(double valor) {
        if (saldo < 0 || saldo < valor) {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo na conta: ");
            return saldo;
        } else {
            System.out.println("Realizando o saque no valor de: " + valor);
            System.out.println("Saldo na conta: ");
            return saldo -= valor;
        }
    };
}
