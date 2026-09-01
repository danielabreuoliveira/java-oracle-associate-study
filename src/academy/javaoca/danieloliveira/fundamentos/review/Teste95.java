package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste95 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3};

        int somaValores = 0;
        int media = 0;
        for (int i = 0; i < numeros.length ; i++) {
            somaValores += numeros[i];
        }

        media = somaValores/ numeros.length;

        System.out.println("soma valores: " + somaValores);
        System.out.println("media: " + media);
    }
}
