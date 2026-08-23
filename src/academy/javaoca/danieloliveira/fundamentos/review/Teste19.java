package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma opcao: ");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Consultar ");
        System.out.println("3 - Excluir ");
        System.out.println("0 - Sair ");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Excluir");
                break;
            case 0:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opcao invalida: ");
                break;
        }
    }
}
