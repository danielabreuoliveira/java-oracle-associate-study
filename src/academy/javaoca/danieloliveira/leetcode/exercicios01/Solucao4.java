package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao4 {
    public int[] menorSoma(int[] numeros){

        int menorSoma = Integer.MAX_VALUE;
        int numero1 = 0;
        int numero2 = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
               int soma = numeros[i]+numeros[j];
            if(menorSoma>soma){
                menorSoma = soma;
                numero1 = numeros[i];
                numero2 = numeros[j];
            }
            }

        }
        return new int[]{numero1,numero2};
    }
}
