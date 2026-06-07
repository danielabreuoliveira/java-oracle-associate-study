package academy.javaoca.danieloliveira.poo.dominio6;

public class Biblioteca {
    private String nome;
    private String endereco;
    private Livro[] livros;
    private Leitor[] leitores;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Leitor[] getLeitores() {
        return leitores;
    }

    public void setLeitores(Leitor[] leitores) {
        this.leitores = leitores;
    }
}
