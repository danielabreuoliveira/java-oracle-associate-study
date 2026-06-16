package academy.javaoca.danieloliveira.poo.dominio37.dominio;

public class Desenvolvedor extends Funcionario{
    double bonus;
    public Desenvolvedor(String nome, double salario, TipoDeFuncionario tipoDeFuncionario) {
        super(nome, salario, tipoDeFuncionario);
    }

    @Override
    public double calcularBonus() {
        return bonus = getSalario()*0.05;
    }
}
