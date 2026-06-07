package academy.javaoca.danieloliveira.poo.dominio;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }
    public void sacar(double valorSacado){
        saldo -= valorSacado;
    }
    public void mostrarSaldo(){
        System.out.println(saldo);
    }
}
