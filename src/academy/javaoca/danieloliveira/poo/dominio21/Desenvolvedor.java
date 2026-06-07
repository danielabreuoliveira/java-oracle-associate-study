package academy.javaoca.danieloliveira.poo.dominio21;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario, Cargo cargo) {
        super(nome, salario, cargo);
    }
    @Override
    public double calcularBonus() {
        return (getSalario()*(getCargo().getBonus()/100));
    }
}
