package academy.javaoca.danieloliveira.leetcode.exercicios02;

public class Exercicios03 {
    public String mergeDePalavras(String palavra1, String palavra2){
        int palavraN1 = palavra1.length();
        int palavraN2 = palavra2.length();

        StringBuilder stringBuilder = new StringBuilder();
        int ponteiro1 = 0, ponteiro2 = 0;

        while (ponteiro1<palavraN1||ponteiro2<palavraN2){
            if(ponteiro1<palavraN1){
                stringBuilder.append(palavra1.charAt(ponteiro1++));
            }
            if(ponteiro2<palavraN2){
                stringBuilder.append(palavra2.charAt(ponteiro2++));
            }
        }
        return stringBuilder.toString();
    }
}
