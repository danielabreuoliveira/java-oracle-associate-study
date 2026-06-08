package academy.javaoca.danieloliveira.poo.dominio25.dominio;

public class Desenvolvedor extends Funcionario{
    public static final double IMPOSTO = 0.06;
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario()*IMPOSTO;
    }
}
