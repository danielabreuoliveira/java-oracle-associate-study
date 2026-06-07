package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Daniel";
        pessoa.idade = 30;

        pessoa.apresentar();
    }
}
