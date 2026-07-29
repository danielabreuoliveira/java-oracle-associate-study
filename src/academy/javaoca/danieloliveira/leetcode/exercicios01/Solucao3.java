package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao3 {

    public int[] maiorSoma(int[] numeros){
        int maiorSoma = Integer.MIN_VALUE;
        int primerio = 0;
        int segundo = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                 int soma = numeros[i]+numeros[j];
                if(soma>maiorSoma){
                    maiorSoma = soma;
                    primerio = numeros[i];
                    segundo = numeros[j];
                }
            }
        }
        return new int[]{primerio,segundo};
    }
}
