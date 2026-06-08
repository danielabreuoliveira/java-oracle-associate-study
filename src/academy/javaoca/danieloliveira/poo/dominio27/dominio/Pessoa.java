package academy.javaoca.danieloliveira.poo.dominio27.dominio;

import academy.javaoca.danieloliveira.poo.dominio27.repositorio.Imprimivel;

public abstract class Pessoa implements Imprimivel {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String gerarRelatorio() {
        return ("---- Relatorio ----" + " Nome: " + this.nome + " CPF: " + this.cpf);
    }
}
