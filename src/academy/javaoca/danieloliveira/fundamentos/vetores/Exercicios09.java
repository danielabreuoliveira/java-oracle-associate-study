package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios09 {
    public static void main(String[] args) {
        int [][] arraySoma = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("------------USANDO O  FOR------------");
        int soma = 0;
        for (int i = 0; i < arraySoma.length; i++) {
            for (int j = 0; j < arraySoma[i].length; j++) {
                soma = (soma + arraySoma[i][j]);
            }
        }
        System.out.println(soma);
        System.out.println("----------------------------------");
        System.out.println("------------USANDO O  FOR EACH------------");

        int soma2 = 0;
        for (int[]  somado : arraySoma){
            for (int somatotal: somado){
                soma2 = (soma2 + somatotal);
            }
        }
        System.out.println(soma2);
    }
}
