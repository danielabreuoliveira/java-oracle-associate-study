package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste94 {
    public static void main(String[] args) {
        int[] numeros = {1232,122,333,111232,333};

        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(maior<numeros[i]){
                maior = numeros[i];
            } else if (menor>numeros[i]) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }
}
