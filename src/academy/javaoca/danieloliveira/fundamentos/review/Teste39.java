package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste39 {
        public static void main(String[] args) {

            int[] numeros = {5, 2, 8, 1, 3};

            for (int i = 0; i < numeros.length - 1; i++) {

                for (int j = 0; j < numeros.length - 1 - i; j++) {

                    if (numeros[j] > numeros[j + 1]) {

                        int temp = numeros[j];

                        numeros[j] = numeros[j + 1];

                        numeros[j + 1] = temp;
                    }
                }
            }

            System.out.println("Array ordenado:");

            for (int numero : numeros) {
                System.out.println(numero);
            }
        }
    }

