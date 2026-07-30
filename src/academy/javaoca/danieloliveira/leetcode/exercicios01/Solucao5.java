package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao5 {
    public boolean parIgual(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[i] == numeros[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
