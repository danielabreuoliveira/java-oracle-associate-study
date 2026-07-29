package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao2 {
    public int[] somaDeValor(int[] numeros, int target){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if(numeros[j] + numeros[i] == target) {
                    return new int[]{numeros[i], numeros[j], target};
                }
            }
        }
        return numeros;
    }

    public int[] somaIgualPar(int[] numeros, int target){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length ; j++) {
                int soma = numeros[i] + numeros[j];
                if(soma == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
