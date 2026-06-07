package academy.javaoca.danieloliveira.poo.dominio10;

public class Anime {
    private String nome;

    @Override
    public String toString(){
        return "Nome: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
