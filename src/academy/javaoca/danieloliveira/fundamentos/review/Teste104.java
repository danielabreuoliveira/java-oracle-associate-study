package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste104 {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 5, 8, 2, 9, 8};

        for (int i = 0; i < numeros.length; i++) {

            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
