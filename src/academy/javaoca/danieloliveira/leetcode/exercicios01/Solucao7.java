package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao7 {
    public int maiorNumero(int[] numeros){
        int maiorNumero = 0;
        for (int i = 0; i < numeros.length ; i++) {
            for(int j = i+1; j < numeros.length ; j++) {
                    if(maiorNumero<numeros[i]){
                        maiorNumero = numeros[i];
                    } else if (maiorNumero<numeros[j]) {
                        maiorNumero = numeros[j];
                    }
            }
        }
        return maiorNumero;
    }
}
