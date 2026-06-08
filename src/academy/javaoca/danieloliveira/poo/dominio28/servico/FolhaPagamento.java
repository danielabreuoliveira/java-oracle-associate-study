package academy.javaoca.danieloliveira.poo.dominio28.servico;

import academy.javaoca.danieloliveira.poo.dominio28.repositorio.Pagavel;

public class FolhaPagamento {
    public static void processarPagamento(Pagavel pagavel){
        System.out.println(" Pagamento Calculado: " + pagavel.calcularPagamento());
    }
}
