package academy.javaoca.danieloliveira.poo.dominio17;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirCargo() {
        System.out.println("Cargo: " + getNome());
    }

    @Override
    public double calcularBonus() {
        return getSalario()*0.50;
    }
}
