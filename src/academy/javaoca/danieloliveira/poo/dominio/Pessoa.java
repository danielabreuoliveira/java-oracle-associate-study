package academy.javaoca.danieloliveira.poo.dominio;

public class Pessoa {
    public String nome;
    public int idade;

    public void apresentar(){
        System.out.println("Meu nome é " + this.nome + " e tenho " + this.idade + " anos");
    }
}
