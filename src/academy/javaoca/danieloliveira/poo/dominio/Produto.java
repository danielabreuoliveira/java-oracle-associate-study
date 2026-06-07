package academy.javaoca.danieloliveira.poo.dominio;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void adicionarEstoque(int valorQuantidade){
        quantidade += valorQuantidade;
    }
    public void removerEstoque(int valorQuantidade){
        quantidade -= valorQuantidade;
    }
    public void mostrarEstoque(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidade);
    }
}
