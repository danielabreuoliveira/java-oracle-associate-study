package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste48 {
    public static void main(String[] args) {
        int[] numeros = {1,3,4,5,6,8};

        System.out.println("Ordem normal");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+ " ");
        }
        System.out.println();
        System.out.println();
        int incio = 0;
        int fim =  numeros.length-1;

        do{
            int intervalo = numeros[incio];
            numeros[incio] = numeros[fim];
            numeros[fim] = intervalo;

        }while (incio>fim);

        System.out.println("Ordem inversa");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
