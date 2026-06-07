package academy.javaoca.danieloliveira.poo.dominio18;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public final double depositar(double valor){
        return saldo += valor;
    }

    public void imprime(){
        System.out.println(saldo);
    }

}
