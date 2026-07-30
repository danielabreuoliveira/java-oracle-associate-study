package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao9 {
    public int contagemPares(int[] numeros){
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                contador++;
            }
        }
        return contador;
    }
}
