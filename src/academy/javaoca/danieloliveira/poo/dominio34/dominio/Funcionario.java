package academy.javaoca.danieloliveira.poo.dominio34.dominio;

import academy.javaoca.danieloliveira.poo.dominio34.repositorio.Pagavel;

public abstract class Funcionario implements Pagavel {
    private String nome;
    private double salarioBase;
    FormaDePagamento formaDePagamento;

    public Funcionario(String nome, double salarioBase, FormaDePagamento formaDePagamento) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.formaDePagamento = formaDePagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
