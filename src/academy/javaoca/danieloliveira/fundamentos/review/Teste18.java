package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10: ");
        double nota = scanner.nextDouble();

        if(nota>=9&&nota<=10){
            System.out.println("A");
        } else if (nota>=7&&nota<=8.9) {
            System.out.println("B");
        } else if (nota>=5&&nota<=6.9) {
            System.out.println("C");
        } else if (nota<5) {
            System.out.println("D");
        }
        scanner.close();
    }
}
