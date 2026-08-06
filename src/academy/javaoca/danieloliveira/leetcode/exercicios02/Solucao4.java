package academy.javaoca.danieloliveira.leetcode.exercicios02;

public class Solucao4 {
    public String mergeComStrings(String palavra1, String palavra2){
        int p1 = palavra1.length();
        int p2 = palavra2.length();

        StringBuilder resultado = new StringBuilder();
        int i = 0; int j = 0;

        while (i<p1||j<p2){
            if(i<p1){
                resultado.append(palavra1.charAt(i++) + "-");
            }
            if (j<p2){
                resultado.append(palavra2.charAt(j++));
                if(j<p1){
                    resultado.append("-");
                }
            }
        }
        return resultado.toString();
    }
}

