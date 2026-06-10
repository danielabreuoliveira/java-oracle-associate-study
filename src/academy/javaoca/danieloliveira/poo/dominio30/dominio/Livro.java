package academy.javaoca.danieloliveira.poo.dominio30.dominio;

import academy.javaoca.danieloliveira.poo.dominio30.repositorio.Emprestavel;

public class Livro extends ItemBiblioteca implements Emprestavel {
    public Livro(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void gerarRelatorio() {
        super.gerarRelatorio();
    }

    @Override
    public void emprestar() {
        System.out.println("Livro emprestado");
    }

    @Override
    public void devolver() {
        System.out.println("Livro devolvido");
    }
}
