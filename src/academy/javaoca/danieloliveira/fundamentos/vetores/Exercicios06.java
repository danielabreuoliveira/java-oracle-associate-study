package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios06 {
    public static void main(String[] args) {
            int[] arraySoma = {7,8,9};

            int somaElementos = 0;
            int mediaElementos;

        for (int i = 0; i < arraySoma.length; i++) {
              somaElementos = somaElementos + arraySoma[i];
        }
        mediaElementos = somaElementos/arraySoma.length;

        System.out.println(mediaElementos);
    }
}
