package academy.javaoca.danieloliveira.poo.review.teste1;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é: " + nome + " tenho " + idade + " anos");
    }
}
