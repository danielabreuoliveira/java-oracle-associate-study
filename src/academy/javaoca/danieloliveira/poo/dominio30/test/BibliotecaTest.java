package academy.javaoca.danieloliveira.poo.dominio30.test;

import academy.javaoca.danieloliveira.poo.dominio30.dominio.DVD;
import academy.javaoca.danieloliveira.poo.dominio30.dominio.ItemBiblioteca;
import academy.javaoca.danieloliveira.poo.dominio30.dominio.Livro;
import academy.javaoca.danieloliveira.poo.dominio30.dominio.Revista;
import academy.javaoca.danieloliveira.poo.dominio30.repositorio.Emprestavel;
import academy.javaoca.danieloliveira.poo.dominio30.servico.Biblioteca;

public class BibliotecaTest {
    public static void main(String[] args) {
        Revista revista1 = new Revista("playboy","212321323");
        Revista revista2 = new Revista("sexy","212321323");

        Livro livro1 = new Livro("a culpa é das estrelas", "21232312332");
        Livro livro2 = new Livro("Titanic", "21232312332");

        DVD dvd1 = new DVD("Carros", "123123123");
        DVD dvd2 = new DVD("Carros2", "2132131232");

        ItemBiblioteca[] itemBibliotecas = {
                revista1,revista2,
                livro1,livro2,
                dvd2,dvd1
        };

        Emprestavel[] emprestavels = {
                revista1,revista2,
                livro1,livro2,
                dvd1,dvd2
        };
        for (ItemBiblioteca itemBiblioteca : itemBibliotecas) {
            itemBiblioteca.gerarRelatorio();
        }

        for (Emprestavel emprestavel : emprestavels) {
            Biblioteca.realizarDevolucao(emprestavel);
            Biblioteca.realizarEmprestimo(emprestavel);
        }

    }
}
