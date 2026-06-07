package academy.javaoca.danieloliveira.poo.dominio24.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO = 21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do computador");
        return this.valor*IMPOSTO;
    }
}
