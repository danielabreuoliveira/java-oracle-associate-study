package academy.javaoca.danieloliveira.poo.dominio24.test;

import academy.javaoca.danieloliveira.poo.dominio24.dominio.Computador;
import academy.javaoca.danieloliveira.poo.dominio24.dominio.Produto;
import academy.javaoca.danieloliveira.poo.dominio24.dominio.Tomate;

public class ProdutoTest02 {
    public static void main() {
        Produto produto = new Computador("Ryzen 9", 20000);
        Produto produto2 = new Tomate("Tomate Rosado", 1.72);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("--------------------");

    }
}
