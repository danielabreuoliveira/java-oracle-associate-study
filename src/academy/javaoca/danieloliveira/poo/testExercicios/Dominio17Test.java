package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio17.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio17.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio17.Gerente;

public class Dominio17Test {
    public static void main(String[] args) {
        Funcionario funcionario =  new Desenvolvedor("Desenvolvedor",1000);
        funcionario.exibirCargo();
        System.out.println(funcionario.calcularBonus());

        Funcionario[] funcionarios = { new Desenvolvedor("Daniel", 1200), new Gerente("Carlos", 10000)};

        for (Funcionario funcionario1 : funcionarios) {
            funcionario1.exibirCargo();
            System.out.println(funcionario1.calcularBonus());
        }

    }
}
