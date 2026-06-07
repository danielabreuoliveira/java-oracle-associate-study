package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Daniel";
        conta.saldo = 0;

        conta.depositar(500);
        conta.sacar(300);
        conta.mostrarSaldo();
    }
}
