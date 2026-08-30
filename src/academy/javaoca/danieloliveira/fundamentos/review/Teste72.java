package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste72 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3};

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos valores: " + soma);
    }
}
