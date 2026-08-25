package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;

        do{
            System.out.println("Digite um numero: ");
            int n1 = scanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            int n2 = scanner.nextInt();

            System.out.println("-----------");
            System.out.println("1- Soma");
            System.out.println("2- Subtracao");
            System.out.println("3- Multiplicacao");
            System.out.println("4- Divisao");
            System.out.println("");
            System.out.println("Escolha uma opcao: ");

            int opcaoMatematica = scanner.nextInt();
            switch (opcaoMatematica){
                case 1:
                    int soma = n1+n2;
                    System.out.println("resultado da soma: " + soma);
                    break;
                case 2:
                    int sub = n1-n2;
                    System.out.println("resultado da subtracao: " + sub);
                    break;
                case 3:
                    int mult = n1*n2;
                    System.out.println("resultado da subtracao: " + mult);
                    break;
                case 4:
                    int div = n1/n2;
                    System.out.println("resultado da subtracao: " + div);
                    break;
                default:
                    System.out.println("Opcao invalida! ");
            }
            System.out.println("");
            System.out.println("Deseja continuar? (s/n)");
             continuar = scanner.next().charAt(0);

        }while (continuar!='n');

        scanner.close();

    }
}
