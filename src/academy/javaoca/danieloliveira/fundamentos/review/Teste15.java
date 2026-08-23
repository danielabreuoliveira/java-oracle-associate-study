package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite o valor da nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite o valor da nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        System.out.println("Valor da media: " + String.format("%.2f", media));
    }
}
