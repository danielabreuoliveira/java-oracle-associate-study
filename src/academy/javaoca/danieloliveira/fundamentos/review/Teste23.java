package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade: ");
        int quant = scanner.nextInt();
        System.out.println("Digite o preco: ");
        double preco = scanner.nextDouble();

         double produto = quant * preco;

        System.out.println("Valor total do produto: " + produto);
    }
}
