package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        if(idade>=0&&idade<11){
            System.out.println("Criança");
        } else if (idade>=12&&idade<=17) {
            System.out.println("Adolescente");
        } else if (idade>=18&&idade<=59) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
        scanner.close();
    }
}
