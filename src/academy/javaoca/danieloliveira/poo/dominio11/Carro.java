package academy.javaoca.danieloliveira.poo.dominio11;

public class Carro {
    private String nome;
    public final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
