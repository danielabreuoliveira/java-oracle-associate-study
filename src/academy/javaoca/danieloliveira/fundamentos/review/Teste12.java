package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("\nVoce digitou o primeiro numero: " + numero1);
        System.out.println("Voce digitou o segundo numero: " + numero2);
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("A soma dos 2 numeros " + (numero1+numero2));
        System.out.println("A subtração dos 2 numeros " + (numero1 - numero2));
        System.out.println("A Divisao dos 2 numeros " + (numero1/numero2));
        System.out.println("A Multiplição dos 2 numeros " + (numero1*numero2));
        System.out.println("O resto dos 2 numeros " + (numero1%numero2));

        scanner.close();
    }
}
