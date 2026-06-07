package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio21.Cargo;
import academy.javaoca.danieloliveira.poo.dominio21.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio21.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio21.Gerente;

public class Dominio21Test {
    public static void main(String[] args) {
        Funcionario funcionario = new Desenvolvedor("jose",1000, Cargo.JUNIOR);
        Funcionario funcionario2 = new Gerente("joao", 3000, Cargo.SENIOR);
        funcionario.exibirDados();
        System.out.println("Valor do bonus: " + funcionario.calcularBonus());
        System.out.println("----------------------------------");
        funcionario2.exibirDados();
        System.out.println("Valor do bonus: " + funcionario2.calcularBonus());

    }
}
