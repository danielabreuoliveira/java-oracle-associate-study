package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        System.out.println();
        System.out.println("soma");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " + " + i + " = " + (numero+i));
        }
        System.out.println();
        System.out.println("subtracao");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " - " + i + " = " + (numero-i));
        }
        System.out.println();
        System.out.println("multiplicacao");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
        System.out.println();
        System.out.println("divisao");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " / " + i + " = " + (numero/i));
        }
    }
}
