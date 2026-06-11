package academy.javaoca.danieloliveira.poo.dominio34.dominio;

public class Desenvolvedor extends Funcionario{
    private double salarioFinal;

    public Desenvolvedor(String nome, double salarioBase, FormaDePagamento formaDePagamento) {
        super(nome, salarioBase, formaDePagamento);
    }

    @Override
    public double calcularPagamento() {
        return salarioFinal = getSalarioBase() + (getSalarioBase() * 0.1);
    }
}
