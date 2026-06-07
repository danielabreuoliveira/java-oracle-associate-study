package academy.javaoca.danieloliveira.poo.dominio20;

public enum TipoPagamento {
    PIX(0), DEBITO  (5), CREDITO (10);

    double taxa = 0;
    TipoPagamento(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
}
