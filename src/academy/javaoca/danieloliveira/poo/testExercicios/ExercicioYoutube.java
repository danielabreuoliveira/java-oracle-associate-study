package academy.javaoca.danieloliveira.poo.testExercicios;

import java.util.Scanner;

public class ExercicioYoutube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema");
        System.out.println("Digite uma pergunta e eu direi sim ou não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÂO");
        }
    }
}
