package academy.javaoca.danieloliveira.poo.dominio24.dominio;

public abstract class Produto implements Taxavel {

    private String nome;
    public double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
