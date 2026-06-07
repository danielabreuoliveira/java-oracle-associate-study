package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Produto01;

public class Produto01Test {
    public static void main(String[] args) {
        Produto01[] produtos = new Produto01[5];

        produtos[0] = new Produto01();
        produtos[0].setNome("Maçã");
        produtos[0].setPreco(1.00);

        produtos[1] = new Produto01();
        produtos[1].setNome("Banana");
        produtos[1].setPreco(2.00);

        produtos[2] = new Produto01();
        produtos[2].setNome("Laranja");
        produtos[2].setPreco(3.00);

        produtos[3] = new Produto01();
        produtos[3].setNome("Melancia");
        produtos[3].setPreco(4.00);

        produtos[4] = new Produto01();
        produtos[4].setNome("Manga");
        produtos[4].setPreco(5.00);

        double produtoMaiorPreco = produtos[0].getPreco();
        String nomeProdutoMaisCaro = produtos[0].getNome();

        for (Produto01 produto : produtos) {
            if (produtoMaiorPreco < produto.getPreco()) {
                produtoMaiorPreco = produto.getPreco();
                nomeProdutoMaisCaro = produto.getNome();
            }
        }

        System.out.println("O produto mais caro é: " + nomeProdutoMaisCaro + " com valor de: " + produtoMaiorPreco + " R$");
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");

        double produtoMenorPreco = produtos[0].getPreco();
        String nomeProdutoBarato = produtos[0].getNome();

        for (Produto01 produto : produtos) {
            if (produtoMenorPreco > produto.getPreco()) {
                produtoMenorPreco = produto.getPreco();
                nomeProdutoBarato = produto.getNome();
            }
        }
        System.out.println("O produto mais barato é: " + nomeProdutoBarato + " com valor de: " + produtoMenorPreco + " R$");
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");

        double soma = 0;
        double media;
        for (Produto01 produto : produtos) {
            soma += produto.getPreco();
        }
        media = soma / produtos.length;
        System.out.println("A media do preco dos produtos é: " + media);

        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");

        double maiorPreco1 = produtos[0].getPreco();
        String nomeMaiorPreco1 = produtos[0].getNome();
        double menorPreco1 = produtos[0].getPreco();
        String nomeMenorPreco1 = produtos[0].getNome();
        double somaPreco1 = 0;
        double mediaPreco1 = 0;
        int qtdMediaPreco2 = 0;

        for (Produto01 produto : produtos) {
            if (maiorPreco1 < produto.getPreco()) {
                maiorPreco1 = produto.getPreco();
                nomeMaiorPreco1 = produto.getNome();
            }
            if (menorPreco1 > produto.getPreco()){
                menorPreco1 = produto.getPreco();
                nomeMenorPreco1 = produto.getNome();
            }
            somaPreco1 += produto.getPreco();
        }
        for (Produto01 produto1 : produtos){
            mediaPreco1 = somaPreco1/produtos.length;
            if (produto1.getPreco()>mediaPreco1){
                qtdMediaPreco2++;
            }
        }

        System.out.println("O produto mais barato é: " + nomeMaiorPreco1+ " com valor de: " + maiorPreco1 + " R$");
        System.out.println("O produto mais barato é: " + nomeMenorPreco1+ " com valor de: " + menorPreco1 + " R$");
        System.out.println("A soma dos preços: " + somaPreco1);
        System.out.println("A media dos preços: " + mediaPreco1);
        System.out.println("Quantidade de produtos acima da media de preços: " + qtdMediaPreco2);
    }
}