package academy.javaoca.danieloliveira.poo.dominio21;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario, Cargo cargo) {
        super(nome, salario, cargo);
    }

    @Override
    public double calcularBonus() {
        return (getSalario()*(getCargo().getBonus()/100));
    }
}
