package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Funcionario2;

public class Funcionario02Test {
    public static void main(String[] args) {
        Funcionario2 funcionario = new Funcionario2();

        funcionario.setNome("joao");
        funcionario.setIdade(41);
        funcionario.setSalarios(new double[] {1000,900,500});

        funcionario.imprimirDados();
    }
}
