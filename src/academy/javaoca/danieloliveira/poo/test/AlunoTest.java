package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "joao";
        aluno.nota1 = 3;
        aluno.nota2 = 7.5;

        aluno.calcularMedia();
        aluno.verificarAprovacao();

    }
}
