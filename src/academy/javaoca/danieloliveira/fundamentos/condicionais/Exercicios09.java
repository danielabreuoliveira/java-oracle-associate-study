package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios09 {
    static void main(String[] args) {
        char categoriaProduto = 'C';
        double precoOriginal = 203.00;
        double desconto;
        double precoFinal;

        switch (categoriaProduto){
            case 'A':
                if(precoOriginal > 100){
                    desconto = precoOriginal * 0.10;
                    precoFinal = precoOriginal - desconto;
                    System.out.println("O produto sofreu 10% de desconto no valor de: R$ " + desconto + " e o preço final ficou: R$ " + precoFinal);
                }else {
                    System.out.println("Produto não recebe desconto");
                }
                break;
            case 'B':
                desconto = precoOriginal * 0.15;
                precoFinal = precoOriginal - desconto;
                System.out.println("O produto sofreu 15% de desconto no valor de: R$ " + desconto + " e o preço final ficou: R$ " + precoFinal);
                break;
            case 'C':
                if (precoOriginal > 200){
                    desconto = precoOriginal * 0.20;
                    precoFinal = precoOriginal - desconto;
                    System.out.println("O produto sofreu 20% de desconto no valor de: R$ " + desconto + " e o preço final ficou: R$ " + precoFinal);
                }else {
                    System.out.println("Produto não recebe desconto");
                }
                break;
            default:
                System.out.println("Opcao invalida!");
        }

    }
}
