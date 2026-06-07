package academy.javaoca.danieloliveira.poo.dominio20;

public class Pagamento {
    private double valor;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
