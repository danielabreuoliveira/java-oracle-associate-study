package academy.javaoca.danieloliveira.poo.dominio26.dominio;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }

}
