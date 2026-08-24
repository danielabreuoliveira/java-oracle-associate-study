package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste24 {

    public static class Produto{
        private String nome;
        private String categoria;
        private double quantidade;
        private double preco;
        private boolean ativo;

        public Produto(String nome, String categoria, double quantidade, double preco, boolean ativo) {
            this.nome = nome;
            this.categoria = categoria;
            this.quantidade = quantidade;
            this.preco = preco;
            this.ativo = ativo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public double getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(double quantidade) {
            this.quantidade = quantidade;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public boolean isAtivo() {
            return ativo;
        }

        public void setAtivo(boolean ativo) {
            this.ativo = ativo;
        }
    }
    public static void main(String[] args) {
        Produto produto = new Produto("skol", "cerveja", 10, 1.71,true);
        System.out.println(produto.nome);
        System.out.println(produto.categoria);
        System.out.println(produto.quantidade);
        System.out.println(produto.preco);
        System.out.println(produto.ativo);
    }
}
