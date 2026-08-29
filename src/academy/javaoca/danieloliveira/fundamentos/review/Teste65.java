package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int quantidade = 0;
        do{
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            quantidade++;

        }while (numero!=0);

        System.out.println("Quantidade de numeros digitados: " + quantidade);
    }
}
