package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste43 {
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};

        int inicio = 0;
        int fim = numeros.length-1;

        while (inicio<fim){
            int auxiliar = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = auxiliar;

            inicio++;
            fim--;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
