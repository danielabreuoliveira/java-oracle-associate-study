package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste49 {
    public static void main(String[] args) {
        int[] numeros = {5,2,8,1,3};
        System.out.println("Array normal");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+ " ");
        }
        System.out.println();
        System.out.println();
        for (int passagem = 0; passagem < numeros.length-1 ; passagem++) {
            for (int i = 0; i < numeros.length-1 ; i++) {
                if(numeros[i] > numeros[i+1]){
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = auxiliar;
                }
            }
        }

        System.out.println("Array ordenado");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+ " ");
        }

    }
}
