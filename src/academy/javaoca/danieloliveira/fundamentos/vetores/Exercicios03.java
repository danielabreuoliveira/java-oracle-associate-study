package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios03 {
    public static void main(String[] args) {
            int[] vetorNumerosPares = {1,2,3,4,5,6};

        for (int i = 0; i < vetorNumerosPares.length; i++) {
            if(vetorNumerosPares[i]%2 == 0) {
                System.out.println(vetorNumerosPares[i]);
            }
            }
    }
}
