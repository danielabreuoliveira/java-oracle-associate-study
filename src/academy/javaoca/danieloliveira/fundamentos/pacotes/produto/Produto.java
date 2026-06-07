package academy.javaoca.danieloliveira.fundamentos.pacotes.produto;

public class Produto {

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String nome;
    int quantidade;
}
