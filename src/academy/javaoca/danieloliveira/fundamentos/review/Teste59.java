package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0  a 10: ");
        double nota = scanner.nextDouble();

        if(nota>=9){
            System.out.println("Conceito A");
        } else if (nota>=7 && nota<9) {
            System.out.println("Conceito B");
        } else if (nota>=5 && nota<7) {
            System.out.println("Conceito C");
        } else if (nota<5) {
            System.out.println("Conceito D");
        }
    }
}
