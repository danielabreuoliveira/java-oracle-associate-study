package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;
        do{
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            contador++;

        }while (numero!=0);

        System.out.println("Numeros digitados: " + contador);
    }
}
