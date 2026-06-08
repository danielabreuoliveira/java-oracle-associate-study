package academy.javaoca.danieloliveira.poo.dominio28.dominio;

public class Gerente extends Funcionario{
    private double pagamento;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento() {
        return pagamento = getSalarioBase()+(getSalarioBase()*0.3);
    }
}
