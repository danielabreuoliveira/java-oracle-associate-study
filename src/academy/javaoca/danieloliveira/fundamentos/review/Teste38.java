package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste38 {
    public static void main(String[] args) {

        /*

               int[] numeros = {1, 2, 3, 4, 5};

        for (int inicio = 0, fim = numeros.length - 1;
             inicio < fim;
             inicio++, fim--) {

            int temp = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

         */
                int[] numeros = {1, 2, 3, 4, 5};

                int inicio = 0;
                int fim = numeros.length - 1;

                while (inicio < fim) {

                    int temp = numeros[inicio];
                    numeros[inicio] = numeros[fim];
                    numeros[fim] = temp;

                    inicio++;
                    fim--;
                }

                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }
            }
        }

