package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste98 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        int inicio = 0;
        int fim = numeros.length-1;

        do{
            int intervalo = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = intervalo;

        }while (inicio>fim);

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
