package academy.javaoca.danieloliveira.poo.dominio33.dominio;

import academy.javaoca.danieloliveira.poo.dominio33.repositorio.Bonificavel;
import academy.javaoca.danieloliveira.poo.dominio33.repositorio.Cargo;

public class Gerente extends Funcionario implements Bonificavel {
    double salarioFinal = 0;
    public Gerente(String nome, double salario, Cargo cargo) {
        super(nome, salario, cargo);
    }

    @Override
    public double calcularBonus() {
        return salarioFinal = (getSalario()*0.2);
    }
}
