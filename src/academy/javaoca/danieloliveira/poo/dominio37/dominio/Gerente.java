package academy.javaoca.danieloliveira.poo.dominio37.dominio;

public class Gerente extends Funcionario{
    double bonus;
    public Gerente(String nome, double salario, TipoDeFuncionario tipoDeFuncionario) {
        super(nome, salario, tipoDeFuncionario);
    }

    @Override
    public double calcularBonus() {
        return bonus = getSalario() * 0.1;
    }
}
