package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste75 {
    public static void main(String[] args) {
        int[] numeros = {7,3,5,1,3,8,9};

        System.out.print("Lista original ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        int inicio = 0;
        int fim = numeros.length-1;

        do{
            int intervalor = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = intervalor;

        }while (inicio>fim);

        System.out.print("Lista inversa ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
