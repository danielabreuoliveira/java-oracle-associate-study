package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Pessoa2;

public class Pessoa02Test {
    public static void main(String[] args) {
        Pessoa2 pessoa = new Pessoa2();

        pessoa.setNome("orochimaru");
        pessoa.setIdade(33);

        pessoa.imprime();
    }
}
