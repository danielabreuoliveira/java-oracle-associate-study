package academy.javaoca.danieloliveira.poo.dominio24.servico;

import academy.javaoca.danieloliveira.poo.dominio24.repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no repositorio banco de dados");
    }
}
