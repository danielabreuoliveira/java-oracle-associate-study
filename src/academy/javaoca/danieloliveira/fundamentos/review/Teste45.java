package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste45 {
    public static void main(String[] args) {
        int[] numeros = {11,12,13,7,8,9};

        System.out.println("Ordem normal");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+",");
        }
        System.out.println();
        System.out.println();
        int inicio = 0;
        int fim = numeros.length-1;

        do{
            int auxiliar = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = auxiliar;

            inicio++;
            fim--;
        }while (inicio<fim);

        System.out.println("Ordem inversa");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+",");
        }
    }
}
