package academy.javaoca.danieloliveira.poo.dominio;

public class Pessoa2 {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (this.idade < 0) {
            System.out.println("idade Invalida");
            return;
        } else {
            this.idade = idade;
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome " + this.nome);
        System.out.println("Idade " + this.idade);
    }


}
