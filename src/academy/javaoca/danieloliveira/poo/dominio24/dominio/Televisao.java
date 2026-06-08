package academy.javaoca.danieloliveira.poo.dominio24.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto da televisao");
        return this.valor*IMPOSTO;
    }
}
