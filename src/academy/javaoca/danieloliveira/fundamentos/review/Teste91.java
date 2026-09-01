package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.println("");
        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisao");

        char opcaoSaida;
        System.out.println("");
        System.out.println("Escolha uma opcao: ");
        int opcao = scanner.nextInt();
        do{
            switch (opcao){
                case 1:
                    System.out.println(n1 + " + " + "1 " + " = " + (n1+1));
                    break;
                case 2:
                    System.out.println(n1 + " - " + "1 " + " = " + (n1-1));
                    break;
                case 3:
                    System.out.println(n1 + " * " + "1 " + " = " + (n1*1));
                    break;
                case 4:
                    System.out.println(n1 + " / " + "1 " + " = " + (n1/1));
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }

            System.out.println("");
            System.out.println("Deseja continuar ? s/n");
            opcaoSaida = scanner.next().charAt(0);

        }while (opcaoSaida!='n');


    }
}
