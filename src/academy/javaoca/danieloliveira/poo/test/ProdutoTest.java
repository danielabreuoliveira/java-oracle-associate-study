package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Biscoito";
        produto.preco = 3.75;
        produto.quantidade = 13;

        produto.adicionarEstoque(3);
        produto.removerEstoque(11);
        produto.mostrarEstoque();
    }
}
