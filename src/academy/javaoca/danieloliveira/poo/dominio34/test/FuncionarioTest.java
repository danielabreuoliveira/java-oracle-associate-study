package academy.javaoca.danieloliveira.poo.dominio34.test;

import academy.javaoca.danieloliveira.poo.dominio34.dominio.*;
import academy.javaoca.danieloliveira.poo.dominio34.servico.FolhaDePagamento;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Daniel", 15000, FormaDePagamento.CARTAO);
        Gerente gerente2 = new Gerente("Danilo", 12000, FormaDePagamento.PIX);
        Gerente gerente3 = new Gerente("Damiao", 11000, FormaDePagamento.CARTAO);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Janaina", 4500, FormaDePagamento.BOLETO);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Joana", 3500, FormaDePagamento.BOLETO);

        Estagiario estagiario1 = new Estagiario("Joaquim", 350, FormaDePagamento.PIX);
        Estagiario estagiario2 = new Estagiario("Mickaella", 750, FormaDePagamento.PIX);

        Funcionario[] funcionarios = {
                gerente1,gerente2,gerente3,
                desenvolvedor1,desenvolvedor2,
                estagiario1,estagiario2
        };

        for (Funcionario funcionario : funcionarios) {
            FolhaDePagamento.imprimeFuncionario(funcionario);
        }

        FolhaDePagamento.totalPagoFuncionario(funcionarios);
        FolhaDePagamento.totalPagemntosFuncionario(funcionarios);
        FolhaDePagamento.contarPorFuncaoFuncionarios(funcionarios);


    }
}
