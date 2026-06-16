package academy.javaoca.danieloliveira.poo.dominio37.test;

import academy.javaoca.danieloliveira.poo.dominio37.dominio.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio37.dominio.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio37.dominio.Gerente;
import academy.javaoca.danieloliveira.poo.dominio37.dominio.TipoDeFuncionario;
import academy.javaoca.danieloliveira.poo.dominio37.servico.RH;
import academy.javaoca.danieloliveira.poo.dominio37.servico.RelatorioEmpresa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario[] funcionario = {
                new Gerente("Joao", 1000, TipoDeFuncionario.GERENTE),
                new Gerente("Jose", 1000, TipoDeFuncionario.GERENTE),
                new Gerente("Joana", 1000, TipoDeFuncionario.GERENTE),
                new Desenvolvedor("Daniel", 1000, TipoDeFuncionario.DESENVOLVEDOR),
                new Desenvolvedor("Mickaella", 1000, TipoDeFuncionario.DESENVOLVEDOR),
                new Desenvolvedor("Cecilia", 1000, TipoDeFuncionario.DESENVOLVEDOR),
                new Desenvolvedor("Macia", 1000, TipoDeFuncionario.DESENVOLVEDOR)
        };

        for (Funcionario funcionario1 : funcionario) {
            RH.imprimirRelatorioFunacionario(funcionario1);
            System.out.println("Valor do bonus: " + funcionario1.calcularBonus());
            System.out.println("-----------------");
        }
        /*
        RH.calcularTotalGastoPorFuncionario(funcionario);
        RH.calcularTotalGastoPorBonus(funcionario);
        RH.maiorBonus(funcionario);
        RH.menorBonus(funcionario);
        RH.mediaSalarial(funcionario);
        */

        RelatorioEmpresa.exibirRelatorio(funcionario);
    }

}
