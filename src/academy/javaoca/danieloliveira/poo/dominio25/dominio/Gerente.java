package academy.javaoca.danieloliveira.poo.dominio25.dominio;

public class Gerente extends Funcionario{
    public static final double IMPOSTO = 0.20;
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario()*IMPOSTO;
    }
}
