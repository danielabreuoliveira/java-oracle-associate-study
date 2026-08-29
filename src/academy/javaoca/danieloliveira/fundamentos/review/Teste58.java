package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if(numero>0){
            System.out.println("O numero digitado: " + numero + " é positivo!" );
        } else if (numero<0) {
            System.out.println("O numero digitado: " + numero + " é negativo!" );
        }else {
            System.out.println("O numero é zero: " + numero);
        }
    }
}
