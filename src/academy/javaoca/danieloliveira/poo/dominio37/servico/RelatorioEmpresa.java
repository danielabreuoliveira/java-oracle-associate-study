package academy.javaoca.danieloliveira.poo.dominio37.servico;

import academy.javaoca.danieloliveira.poo.dominio37.dominio.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio37.dominio.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio37.dominio.Gerente;

public class RelatorioEmpresa {
    public static void exibirRelatorio(Funcionario[] funcionarios){
        int somaGerente = 0;
        int somaDev = 0;
        System.out.println("");
        System.out.println("------------- Relatorio da empresa ---------------");

        for (Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Gerente){
                somaGerente++;
            } else if (funcionario instanceof Desenvolvedor) {
                somaDev++;
            }
        }
        RH.totalFuncionarios(funcionarios);
        System.out.println("Quantidade de gerentes: " + somaGerente);
        System.out.println("Quantidade de Desenvolvedores: " + somaDev);
        RH.calcularTotalGastoPorFuncionario(funcionarios);
        RH.calcularTotalGastoPorBonus(funcionarios);
        RH.mediaSalarial(funcionarios);
        RH.maiorBonus(funcionarios);
        RH.menorBonus(funcionarios);
    }
}
