package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste76 {
    public static void main(String[] args) {
        int[] numeros = {1,3,5,7,8,3,22,11};

        System.out.print("lista normal: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int j = 0; j < numeros.length-1; j++) {
            for (int i = 0; i < numeros.length-1; i++) {
                if(numeros[i]>numeros[i+1]){
                    int intervalo = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = intervalo;
                }
            }
        }
        System.out.print("lista ordenada: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
