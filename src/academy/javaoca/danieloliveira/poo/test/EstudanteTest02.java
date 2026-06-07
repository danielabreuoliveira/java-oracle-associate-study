package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Estudante;
import academy.javaoca.danieloliveira.poo.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Naruto";
        estudante01.idade = 31;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 29;
        estudante02.sexo = 'F';

        impressora.imprimeEstudante(estudante01);
        impressora.imprimeEstudante(estudante02);

        estudante01.imprime();
        estudante02.imprime();
    }
}
