package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "joao";
        funcionario.salario = 5500;

        funcionario.calcularBonus();
        funcionario.mostrarDados();
    }
}
