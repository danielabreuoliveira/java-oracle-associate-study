package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio7.Aluno;
import academy.javaoca.danieloliveira.poo.dominio7.Curso;
import academy.javaoca.danieloliveira.poo.dominio7.Instrutor;
import academy.javaoca.danieloliveira.poo.dominio7.Plataforma;

public class Exercicios04 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Naruto",31);
        Instrutor instrutor = new Instrutor("Kakashi", "Jutsu");
        Aluno[] alunosCurso = {aluno};

        Curso curso = new Curso("Java",instrutor,alunosCurso);

        Curso[] cursosPlataforma = {curso};
        Plataforma plataforma = new Plataforma("Udemy",cursosPlataforma);

        plataforma.imprime();
    }
}
