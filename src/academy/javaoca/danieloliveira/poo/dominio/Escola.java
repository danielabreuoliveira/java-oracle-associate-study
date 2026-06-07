package academy.javaoca.danieloliveira.poo.dominio;

public class Escola {
    private String nome;
    private Professor01[] professores;

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null) return;
        for (Professor01 professor : professores) {
            System.out.println(professor.getNome());
        }

    }
    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor01[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor01[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor01[] professores) {
        this.professores = professores;
    }
}
