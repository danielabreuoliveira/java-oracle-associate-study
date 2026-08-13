package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste {
    public static void main(String[] args) {
        double precoUnitario = 25.90;
        int quantidade = 3;
        int desconto = 10;

        double subtotal = precoUnitario * quantidade;
        double valorDesconto = subtotal * (desconto/100);
        double total = subtotal - valorDesconto;

        System.out.println(total);
    }
}
