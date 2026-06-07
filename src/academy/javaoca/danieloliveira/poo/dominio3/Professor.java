package academy.javaoca.danieloliveira.poo.dominio3;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println("---------- Dados Professor -------------------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(seminarios == null) return;
        System.out.println("## seminarios cadastrados ##");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if(seminario.getEstudantes() == null) continue;
            System.out.println("## Estudantes ");
            for (Estudante estudante : seminario.getEstudantes()) {
                System.out.println("Estudantes: " + estudante.getNome() + " Idade: " +estudante.getIdade());
            }

        }
        System.out.println("-----------------------------");
    }
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
