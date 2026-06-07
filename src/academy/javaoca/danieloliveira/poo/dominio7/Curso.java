package academy.javaoca.danieloliveira.poo.dominio7;

public class Curso {
    private String nome;
    private Instrutor instrutor;
    private Aluno[] alunos;

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso(String nome,Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public Curso(String nome,Instrutor instrutor, Aluno[] alunos) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
