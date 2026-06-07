package academy.javaoca.danieloliveira.poo.dominio14;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome,String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void apresentar(){
        System.out.println("Nome: " +  getNome());
        System.out.println("Matricula: " + this.matricula);

    }
}
