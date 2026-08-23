package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int n3 = scanner.nextInt();
        System.out.println("----------------------------");

        if(n1>n2&&n1>n3){
            System.out.println("Valor do numero1: " + n1 + " Valor do numero2: " + n2 + " Valor do numero3: " + n3);
            System.out.println("O primeiro numero é maior");
        } else if (n2>n1&&n2>n3) {
            System.out.println("Valor do numero1: " + n1 + " Valor do numero2: " + n2 + " Valor do numero3: " + n3);
            System.out.println("O segundo numero é maior");
        }else {
            System.out.println("Valor do numero1: " + n1 + " Valor do numero2: " + n2 + " Valor do numero3: " + n3);
            System.out.println("O terceiro numero é maior");
        }

    }
}
