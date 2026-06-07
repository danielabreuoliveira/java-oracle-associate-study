package academy.javaoca.danieloliveira.fundamentos.repeticao;

public class Exercicios11 {
  public static void main(String[] args) {
        double soma = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
