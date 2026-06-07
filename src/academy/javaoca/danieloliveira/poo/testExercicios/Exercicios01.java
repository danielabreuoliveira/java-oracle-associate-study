package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio3.Estudante;
import academy.javaoca.danieloliveira.poo.dominio3.Local;
import academy.javaoca.danieloliveira.poo.dominio3.Professor;
import academy.javaoca.danieloliveira.poo.dominio3.Seminario;

public class Exercicios01 {
    public static void main(String[] args) {

        Local local = new Local("Rua parnaiba");
        Estudante estudante = new Estudante("Luffy",17);
        Estudante estudante2 = new Estudante("Naruto",25);
        Estudante[] estudanteParaSeminarios = {estudante,estudante2};

        Professor professor = new Professor("Carlos", "Portugues");

        Seminario seminarios = new Seminario("onde achar one piece", estudanteParaSeminarios, local);

        Seminario[] seminarioDisponiveis = {seminarios};

        professor.setSeminarios(seminarioDisponiveis);

        professor.imprime();

    }
}
