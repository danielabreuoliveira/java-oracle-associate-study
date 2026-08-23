package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Idade digitada: " + idade + " anos");
        System.out.println("---------------------------");
        System.out.println("Pessoa pode votar: " + (idade>=16));
        System.out.println("Pessoa pode tirar a caterira: " + (idade>=18));
        System.out.println("Pessoa pode aposentar: " + (idade>=65));

        scanner.close();
    }
}
