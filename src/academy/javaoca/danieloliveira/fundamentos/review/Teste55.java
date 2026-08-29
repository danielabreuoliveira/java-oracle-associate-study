package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua  idade: ");
        int idade = scanner.nextInt();

        System.out.println("Pessoa pode votar! " + (idade>=16));
        System.out.println("Pessoa pode tirar carteira de motorista! " + (idade>=18));
        System.out.println("Pessoa pode se aposentar! " + (idade>=65));
    }
}
