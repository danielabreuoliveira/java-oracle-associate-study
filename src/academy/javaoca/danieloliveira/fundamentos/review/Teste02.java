package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        double total = 0;
        double venda_dia = 0;

        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("Digite a venda do dia: " + dia);
            Scanner leitor = new Scanner(System.in);
            venda_dia = leitor.nextDouble();
            total += venda_dia;
        }

        System.out.println("media semanal: %.2f" + total/7);

    }
}
