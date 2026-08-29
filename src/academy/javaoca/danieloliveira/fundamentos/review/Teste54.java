package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.println("Soma: " + (n1+n2));
        System.out.println("Multiplicacao: " + (n1*n2));
        System.out.println("Subtracao:  " + (n1-n2));
        System.out.println("Divisao: " + (n1/n2));
    }
}
