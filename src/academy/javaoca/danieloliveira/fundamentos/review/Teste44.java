package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste44 {
    public static void main(String[] args) {
        int[] numeros = {21,11,31,44,7,8};

        int inicio = 0;
        int fim = numeros.length-1;

        while (inicio<fim){
            int intervalo = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = intervalo;

            inicio++;
            fim--;
        }

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Em onderm: " + numeros[i]);
        }
    }
}
