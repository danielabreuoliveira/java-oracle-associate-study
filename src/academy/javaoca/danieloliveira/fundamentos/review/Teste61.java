package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        if(numero1>numero2&&numero1>numero3){
            System.out.println("O primeiro numero é maior: " + numero1);
        } else if (numero2>numero1&&numero2>numero3) {
            System.out.println("O segundo numero é maior: " + numero2);
        } else if (numero3>numero1&&numero3>numero2) {
            System.out.println("O terceiro numero é maior: " + numero3);
        }
    }
}
