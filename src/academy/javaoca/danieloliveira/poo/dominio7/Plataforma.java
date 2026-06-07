package academy.javaoca.danieloliveira.poo.dominio7;

public class Plataforma {
    private String nome;
    private Curso[] cursos;

    public void imprime() {
        System.out.println(this.nome);
        if (cursos != null) {
            for (Curso curso : cursos) {
                System.out.println("------------DADOS CURSO----");
                System.out.println("Nome: " + curso.getNome());
                System.out.println("------DADOS INSTRUTOR----");
                System.out.println("Nome: " + curso.getInstrutor().getNome());
                System.out.println("Especialidade: " + curso.getInstrutor().getEspecialidade());
                System.out.println("--------ALUNOS-----");
                for (Aluno aluno : curso.getAlunos()) {
                    System.out.println("Alunos:" + aluno.getNome() + " Idade: " + aluno.getIdade());
                }
            }
        }else {
            System.out.println("Sem dados no curso!");
        }

    }

    public Plataforma(String nome) {
        this.nome = nome;
    }

    public Plataforma(String nome, Curso[] cursos) {
        this.nome = nome;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
}
