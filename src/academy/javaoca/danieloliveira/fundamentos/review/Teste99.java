package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste99 {
    public static void main(String[] args) {
        int[] numeros = {1,3,5,2,2,3,4};

        for (int j = 0; j < numeros.length-1; j++) {
            for (int i = 0; i < numeros.length-1; i++) {
                    if(numeros[i]>numeros[i+1]){
                        int intervalo = numeros[i];
                        numeros[i] = numeros[i+1];
                        numeros[i+1] = intervalo;
                    }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
