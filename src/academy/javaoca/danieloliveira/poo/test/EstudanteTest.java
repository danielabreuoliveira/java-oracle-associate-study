package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Estudante;

public class EstudanteTest {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "naruto";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
      }
}
