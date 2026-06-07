package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios04 {
    public static void main(String[] args) {
        int[] vetorMaiorElemento = {5,9,2,20,1};

        int maior = vetorMaiorElemento[0];

        for (int i = 0; i < vetorMaiorElemento.length; i++) {
            if(vetorMaiorElemento[i]>maior) {
                maior = vetorMaiorElemento[i];
            }
        }
        System.out.println(maior);

    }
}
