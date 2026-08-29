package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;

        System.out.println("---------Calculadora---------");

        System.out.println("Digite o numero: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a opção matematica: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        int opcaoMatematica = scanner.nextInt();
        do{
            switch (opcaoMatematica){
                case 1:
                    System.out.println("Tabuada de soma: ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " + " + i + " = " + ( numero+i));
                    }
                    break;
                case 2:
                    System.out.println("Tabuada de subtracao: ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " - " + i + " = " + ( numero-i));
                    }
                    break;
                case 3:
                    System.out.println("Tabuada de multiplicação: ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " * " + i + " = " + ( numero*i));
                    }
                    break;
                case 4:
                    System.out.println("Tabuada de divisao: ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " / " + i + " = " + ( numero/i));
                    }
                    break;
                default:
                    System.out.println("Operação invalida!");
            }
            System.out.println("Deseja continuar ? (s/n)");
            continuar = scanner.next().charAt(0);
        }while (continuar!='n');

        scanner.close();
    }
}
