package academy.javaoca.danieloliveira.leetcode.exercicios01;


import java.util.Arrays;

public class Exercicios01Test {
    public static void main() {

        int[] nums = {2,7,11,15};
        int[] numeros = {5,8,2,10,3};
        int target = 9;
        int target2 = 13;

        Solucao solucao = new Solucao();
        Solucao2 solucao2 = new Solucao2();

        int[] resultado = solucao.twoSum(nums, target);
        int[] resultado2 = solucao2.somaDeValor(numeros,target2);
        int[] resultado3 = solucao2.somaIgualPar(numeros,target2);

        System.out.println(Arrays.toString(resultado));
        System.out.println(Arrays.toString(resultado2));
        System.out.println(Arrays.toString(resultado3));


    }
}
