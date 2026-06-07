package academy.javaoca.danieloliveira.poo.dominio24.test;

import academy.javaoca.danieloliveira.poo.dominio24.dominio.Computador;
import academy.javaoca.danieloliveira.poo.dominio24.dominio.Tomate;
import academy.javaoca.danieloliveira.poo.dominio24.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador01 = new Computador("HP", 10000);
        Tomate tomate01 = new Tomate("Tomate Cereja", 1.71);
        CalculadoraImposto.calcularImpostoComputador(computador01);
        CalculadoraImposto.calcularImpostoTomate(tomate01);
    }
}
