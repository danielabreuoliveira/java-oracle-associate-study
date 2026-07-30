package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao8 {
    public int menorNumero(int[] numeros){
        int menorNumero = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(menorNumero>numeros[i]){
                    menorNumero = numeros[i];
                } else if (menorNumero>numeros[j]) {
                    menorNumero = numeros[j];
                }
            }

        }
        return menorNumero;
    }
}
