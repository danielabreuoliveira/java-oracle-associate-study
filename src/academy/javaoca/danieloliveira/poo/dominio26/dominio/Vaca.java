package academy.javaoca.danieloliveira.poo.dominio26.dominio;

public class Vaca extends Animal{
    public Vaca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "muuuuuuuuuuuu";
    }

}
