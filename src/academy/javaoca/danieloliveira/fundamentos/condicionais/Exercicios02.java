package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios02 {
    static void main(String[] args) {
        int idade = 18;

        if(idade >= 18){
            System.out.println("Maior de idade");
        } else if (idade < 18) {
            System.out.println("Menor de idade");
        }else {
            System.out.println("Opção invalida");
        }
    }
}
