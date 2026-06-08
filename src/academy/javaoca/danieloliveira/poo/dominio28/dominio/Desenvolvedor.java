package academy.javaoca.danieloliveira.poo.dominio28.dominio;

public class Desenvolvedor extends Funcionario{
    private double pagamento;
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento() {
        pagamento = getSalarioBase()+ (this.getSalarioBase()*0.1);
        return pagamento;
    }

}
