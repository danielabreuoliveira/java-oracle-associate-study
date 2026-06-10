package academy.javaoca.danieloliveira.poo.dominio33.dominio;

import academy.javaoca.danieloliveira.poo.dominio33.repositorio.Cargo;

public abstract class Funcionario {
    private String nome;
    private double salario;
    Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }
    public abstract double calcularBonus();
}
