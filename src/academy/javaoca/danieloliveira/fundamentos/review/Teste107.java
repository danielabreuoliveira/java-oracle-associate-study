package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste107 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,3,3,3};

        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if(numeros[i] == numeros[j]){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
