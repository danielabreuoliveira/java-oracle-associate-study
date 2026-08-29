package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma opção: ");
        System.out.println("---------------------");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Consultar ");
        System.out.println("3 - Excluir ");
        System.out.println("0 - Sair ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Cadastrando");
                break;
            case 2:
                System.out.println("Consultando");
                break;
            case 3:
                System.out.println("Excluindo");
                break;
            case 0:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
