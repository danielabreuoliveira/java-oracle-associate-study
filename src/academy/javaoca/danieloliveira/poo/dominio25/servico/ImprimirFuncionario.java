package academy.javaoca.danieloliveira.poo.dominio25.servico;

import academy.javaoca.danieloliveira.poo.dominio25.dominio.Funcionario;

public class ImprimirFuncionario {
    public static void imprimirRelatorio(Funcionario funcionario){
        System.out.println("Relatorio Funcionario");
        double calculoBonus = funcionario.calcularBonus();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Bonus: " + calculoBonus);

    }
}
