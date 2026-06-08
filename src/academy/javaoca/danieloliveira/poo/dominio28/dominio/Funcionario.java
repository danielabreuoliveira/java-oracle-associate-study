package academy.javaoca.danieloliveira.poo.dominio28.dominio;

import academy.javaoca.danieloliveira.poo.dominio28.repositorio.Pagavel;
import academy.javaoca.danieloliveira.poo.dominio28.repositorio.Relatorio;

public abstract class Funcionario implements Pagavel, Relatorio {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String gerarRelatorio() {
        return ("\n-----------Relatorio Funcionario ----------"
                + "\n Nome: " + getNome() +
                "\n Salario base: " + getSalarioBase() +
                "\n Salario Final: " +calcularPagamento());
    }
}
