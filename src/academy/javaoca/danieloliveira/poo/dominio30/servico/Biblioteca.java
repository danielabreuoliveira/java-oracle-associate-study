package academy.javaoca.danieloliveira.poo.dominio30.servico;

import academy.javaoca.danieloliveira.poo.dominio30.repositorio.Emprestavel;

public class Biblioteca {
    public static void realizarEmprestimo(Emprestavel item){
            item.emprestar();
    }

    public static void realizarDevolucao(Emprestavel item){
             item.devolver();
    }
}
