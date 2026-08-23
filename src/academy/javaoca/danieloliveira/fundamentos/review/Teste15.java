package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da nota 1: ");
        int nota1 = scanner.nextInt();
        System.out.println("Digite o valor da nota 2: ");
        int nota2 = scanner.nextInt();
        System.out.println("Digite o valor da nota 3: ");
        int nota3 = scanner.nextInt();

        double media = (nota1+nota2+nota3)/3;
        String mediaString = String.valueOf(media);

        System.out.println("Valor da media: " + (String.format(mediaString)));
    }
}
