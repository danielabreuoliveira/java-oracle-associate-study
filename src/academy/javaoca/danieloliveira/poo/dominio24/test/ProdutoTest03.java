package academy.javaoca.danieloliveira.poo.dominio24.test;

import academy.javaoca.danieloliveira.poo.dominio24.dominio.Computador;
import academy.javaoca.danieloliveira.poo.dominio24.dominio.Produto;
import academy.javaoca.danieloliveira.poo.dominio24.dominio.Tomate;
import academy.javaoca.danieloliveira.poo.dominio24.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main() {
        Produto produto = new Computador("Ryzen 9", 20000);

        Tomate tomate = new Tomate("Tomate Rosado", 1.72);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
