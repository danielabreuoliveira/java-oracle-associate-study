package academy.javaoca.danieloliveira.poo.dominio33.dominio;

import academy.javaoca.danieloliveira.poo.dominio33.repositorio.Bonificavel;
import academy.javaoca.danieloliveira.poo.dominio33.repositorio.Cargo;

public class Estagiario extends Funcionario implements Bonificavel {
    double salarioFinal = 0;
    public Estagiario(String nome, double salario, Cargo cargo) {
        super(nome, salario, cargo);
    }

    @Override
    public double calcularBonus() {
        return salarioFinal = (getSalario()*0.05);
    }
}
