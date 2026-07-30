package academy.javaoca.danieloliveira.leetcode.exercicios02;

public class Exercicios02Test {
    public static void main(String[] args) {
    /*
        String word1 = ("abc");
        String word2 = ("pqr");

        Exercicios02 exercicios02 = new Exercicios02();
        String resultado = exercicios02.mergeAlternately(word1, word2);
        System.out.println(resultado);

     */
        String palavra1 = ("joao");
        String palavra2 = ("fonseca");

        Solucao solucao = new Solucao();
        String resultado = solucao.mergeDeStrings(palavra1, palavra2);

        System.out.println(resultado);
    }

}
