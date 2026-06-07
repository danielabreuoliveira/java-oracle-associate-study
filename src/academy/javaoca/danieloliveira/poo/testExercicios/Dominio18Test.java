package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio18.Conta;
import academy.javaoca.danieloliveira.poo.dominio18.ContaCorrente;

public class Dominio18Test {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente();
        conta.depositar(100);
        conta.imprime();
    }
}
