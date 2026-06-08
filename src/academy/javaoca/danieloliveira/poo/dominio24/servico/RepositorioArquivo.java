package academy.javaoca.danieloliveira.poo.dominio24.servico;

import academy.javaoca.danieloliveira.poo.dominio24.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Repositorio salvando no arquivo");
    }
}
