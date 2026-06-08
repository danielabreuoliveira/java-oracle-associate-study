package academy.javaoca.danieloliveira.poo.dominio25.test;

import academy.javaoca.danieloliveira.poo.dominio25.dominio.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio25.dominio.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio25.dominio.Gerente;
import academy.javaoca.danieloliveira.poo.dominio25.servico.ImprimirFuncionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
                new Desenvolvedor("joao" , 12000),
                new Gerente("Daniel", 20000)
        };

        for (Funcionario funcionario : funcionarios) {
                ImprimirFuncionario.imprimirRelatorio(funcionario);
            System.out.println("------------------------");
        }
    }
}
