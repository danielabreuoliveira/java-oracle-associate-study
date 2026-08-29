package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste50 {
    public static void main(String[] args) {

        int[] numeros = {30,23,17,21,11,13};

        System.out.println("Lista normal");
        for (int i = 0; i < numeros.length ; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < numeros.length-1; j++) {
            for (int i = 0; i < numeros.length-1; i++) {
                if(numeros[i]>numeros[i+1]){
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = auxiliar;
                }
            }
        }

        System.out.println("Lista ordenada");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
