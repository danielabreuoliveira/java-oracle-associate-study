package academy.javaoca.danieloliveira.poo.dominio28.servico;

import academy.javaoca.danieloliveira.poo.dominio28.repositorio.Pagavel;

public class Financeiro {
    public static double calcularTotalFolha(Pagavel[] funcionarios){
        double somaPagamentos = 0;
        for (Pagavel funcionario : funcionarios) {
            somaPagamentos += funcionario.calcularPagamento();
        }
        return (somaPagamentos);
    }
}
