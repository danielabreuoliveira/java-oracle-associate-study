package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        System.out.println("");
        System.out.println("TABUADA");
        System.out.println("-------------Soma------------");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " + " + i + " = " + (numero+i));
        }
        System.out.println("");
        System.out.println("-------------Subtração------------");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " - " + i + " = " + (numero-i));
        }
        System.out.println("");
        System.out.println("-------------Multplicação------------");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
        System.out.println("");
        System.out.println("-------------Divisao------------");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " / " + i + " = " + (numero/i));
        }
    }
}
