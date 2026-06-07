package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kakashi";
        professor.idade= 51;
        professor.sexo= 'M';

        System.out.println("\nNome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }

}
