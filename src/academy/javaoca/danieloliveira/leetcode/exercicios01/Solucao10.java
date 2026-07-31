package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao10 {
    public int[] somaValores(int[] numeros, int alvo){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i +1 ; j < numeros.length ; j++) {
                if(numeros[i]+numeros[j]==alvo){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
    }
}
