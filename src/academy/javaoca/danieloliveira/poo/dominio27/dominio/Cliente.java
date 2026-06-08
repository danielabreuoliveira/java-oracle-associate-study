package academy.javaoca.danieloliveira.poo.dominio27.dominio;

import academy.javaoca.danieloliveira.poo.dominio27.repositorio.Autenticavel;

public class Cliente extends Pessoa implements Autenticavel {
     private String senha;

     public Cliente(String nome, String cpf, String senha) {
        super(nome, cpf);
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
