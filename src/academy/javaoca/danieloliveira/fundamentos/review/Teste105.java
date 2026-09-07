package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste105 {
    public static void main(String[] args) {
        int[] numeros = {1,3,4,4,3,4,2};

        for (int i = 0; i < numeros.length; i++) {
            boolean repetidos = false;

            for (int j = 0; j < i; j++) {
                if(numeros[i] == numeros[j]){
                    repetidos = true;
                    break;
                }
            }

            if(!repetidos){
                System.out.print(numeros[i] + " ");
            }
        }

    }
}
