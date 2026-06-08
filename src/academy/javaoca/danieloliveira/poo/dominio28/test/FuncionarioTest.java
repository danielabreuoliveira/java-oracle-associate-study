package academy.javaoca.danieloliveira.poo.dominio28.test;

import academy.javaoca.danieloliveira.poo.dominio28.dominio.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio28.dominio.Estagiario;
import academy.javaoca.danieloliveira.poo.dominio28.dominio.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio28.dominio.Gerente;
import academy.javaoca.danieloliveira.poo.dominio28.servico.Financeiro;
import academy.javaoca.danieloliveira.poo.dominio28.servico.FolhaPagamento;

public class FuncionarioTest {
    public static void main(String[] args) {
      /*
        Pagavel[] pagavels = {
                new Desenvolvedor("Joao", 3000),
                new Desenvolvedor("Joana", 3500),
                new Gerente("Joaninha", 4500),
                new Gerente("Joana.jr", 5500),
                new Estagiario("Joaquina", 750),
                new Estagiario("Joao.jr", 500),
        };
        for (Pagavel pagavel : pagavels) {
            FolhaPagamento.processarPagamento(pagavel);
        }

        Relatorio[] relatorios = {
                new Desenvolvedor("Joao", 3000),
                new Desenvolvedor("Joana", 3500),
                new Gerente("Joaninha", 4500),
                new Gerente("Joana.jr", 5500),
                new Estagiario("Joaquina", 750),
                new Estagiario("Joao.jr", 500),
        };
        for (Relatorio relatorio : relatorios) {
            System.out.println(relatorio.gerarRelatorio());
        }
        System.out.println(Financeiro.calcularTotalFolha(pagavels));
    */

        Funcionario[] funcionarios = {
                new Desenvolvedor("Joao", 3000),
                new Desenvolvedor("Joana", 3500),
                new Gerente("Joaninha", 4500),
                new Gerente("Joana.jr", 5500),
                new Estagiario("Joaquina", 750),
                new Estagiario("Joao.jr", 500),
        };

        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario.gerarRelatorio());
            FolhaPagamento.processarPagamento(funcionario);
        }
        System.out.println("---------------------");
        System.out.println("\n Total da soma de todos salarios: " + Financeiro.calcularTotalFolha(funcionarios));
    }

}
