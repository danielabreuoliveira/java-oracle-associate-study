package academy.javaoca.danieloliveira.poo.dominio33.servico;

import academy.javaoca.danieloliveira.poo.dominio33.dominio.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio33.dominio.Estagiario;
import academy.javaoca.danieloliveira.poo.dominio33.dominio.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio33.dominio.Gerente;

public class RH {
    public static void imprimirRelatorio(Funcionario funcionario){
        System.out.println("Nome:" + funcionario.getNome());
        System.out.println("Cargo:" + funcionario.getCargo());
        System.out.println("Salario:" + funcionario.getSalario());
        System.out.println("Bonus:" + funcionario.calcularBonus());
    }
    public static double calcularTotalBonus(Funcionario[] funcionarios){
        double totalFuncionarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalFuncionarios = totalFuncionarios + funcionario.calcularBonus();
        }
        return totalFuncionarios;
    }
    public static double contarGerente(Funcionario[] funcionarios){
        double contador = 0;
        for (Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Gerente){
                contador++;
            }
        }
        return contador;
    };
    public static double contarDesenvolvedor(Funcionario[] funcionarios){
        double contador = 0;
        for (Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Desenvolvedor){
                contador++;
            }
        }
        return contador;
    };
    public static double contarEstagioario(Funcionario[] funcionarios){
        double contador = 0;
        for (Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Estagiario){
                contador ++;
            }
        }
        return contador;
    }
}
