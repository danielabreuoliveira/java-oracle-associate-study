package academy.javaoca.danieloliveira.poo.dominio17;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirCargo() {
        System.out.println("Cargo: " + getNome());
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10;
    }
}
