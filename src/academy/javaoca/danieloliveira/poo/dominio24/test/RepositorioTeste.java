package academy.javaoca.danieloliveira.poo.dominio24.test;

import academy.javaoca.danieloliveira.poo.dominio24.repositorio.Repositorio;
import academy.javaoca.danieloliveira.poo.dominio24.servico.RepositorioBancodeDados;


public class RepositorioTeste {
    public static void main() {
        Repositorio repositorio =  new RepositorioBancodeDados();
        repositorio.salvar();
    }
}
