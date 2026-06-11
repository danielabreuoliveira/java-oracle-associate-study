package academy.javaoca.danieloliveira.poo.dominio34.dominio;

public class Gerente extends Funcionario{
    double salarioFinal;
    public Gerente(String nome, double salarioBase, FormaDePagamento formaDePagamento) {
        super(nome, salarioBase, formaDePagamento);
    }

    @Override
    public double calcularPagamento() {
        return salarioFinal = getSalarioBase() + (getSalarioBase() * 0.2);
    }
}
