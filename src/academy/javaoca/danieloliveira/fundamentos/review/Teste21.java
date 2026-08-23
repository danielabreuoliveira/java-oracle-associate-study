package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do mês do ano: ");
        System.out.println("1 - Janeiro");
        System.out.println("2 - Fevereiro");
        System.out.println("3 - Março");
        System.out.println("4 - Abril");
        System.out.println("5 - Maio: ");
        System.out.println("6 - Junho: ");
        System.out.println("7 - Julho: ");
        System.out.println("8 - Agosto: ");
        System.out.println("9 - Setembro: ");
        System.out.println("10 - Outubro: ");
        System.out.println("11 - Novembro: ");
        System.out.println("12 - Dezembro: ");

        int numeroMes = scanner.nextInt();

        switch (numeroMes){
            case 1:
                System.out.println("Janeiro - Verão");
                break;
            case 2:
                System.out.println("Fevereiro - Verão");
                break;
            case 3:
                System.out.println("Março - Outono");
                break;
            case 4:
                System.out.println("Abril - Outono");
                break;
            case 5:
                System.out.println("Maio - Outono");
                break;
            case 6:
                System.out.println("Junho - Inverno");
                break;
            case 7:
                System.out.println("Julho - Inverno");
                break;
            case 8:
                System.out.println("Agosto - Inverno");
                break;
            case 9:
                System.out.println("Setembro - Primavera");
                break;
            case 10:
                System.out.println("Outubro - Primavera");
                break;
            case 11:
                System.out.println("Novembro - Primavera");
                break;
            case 12:
                System.out.println("Dezembro - Verão");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        scanner.close();
    }
}
