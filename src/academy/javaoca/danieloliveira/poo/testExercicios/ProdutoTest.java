package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio2.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];

        produtos[0] = new Produto("Pao",7.22);
        produtos[1] = new Produto("Bolo", 13.71);
        produtos[2] = new Produto("Chocolate", 7.47);

        double precoprodutoMaisCaro = 0;
        String nomeprodutoMaisCaro = null;
        for (Produto produto : produtos) {
            System.out.println("--------------------------------------------");
            System.out.println("Nome produto: " + produto.getNome() + " Preco produto: " + produto.getPreco());
            if (precoprodutoMaisCaro < produto.getPreco()){
                precoprodutoMaisCaro = produto.getPreco();
                nomeprodutoMaisCaro = produto.getNome();
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("O produto mais caro é: " + nomeprodutoMaisCaro + " com valor de: " + precoprodutoMaisCaro);

    }
}
