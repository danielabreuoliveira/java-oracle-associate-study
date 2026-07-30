package academy.javaoca.danieloliveira.leetcode.exercicios01;

public class Solucao6 {
    public int paresRepetidos(int[] numeros){
        int contador = 0 ;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[i] == numeros[j]){
                    contador++;
                }
            }
        }
        return contador;
    }
}
