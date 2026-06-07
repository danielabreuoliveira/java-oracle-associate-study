package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios02 {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40};
        double soma =0;

        for (int i = 0; i < array1.length; i++) {
            soma = soma + array1[i];
            System.out.println(array1[i]);
        }
        System.out.println(soma);
    }
}
