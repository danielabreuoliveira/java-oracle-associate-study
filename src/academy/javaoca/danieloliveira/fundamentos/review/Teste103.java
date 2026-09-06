package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste103 {
    public static void main(String[] args) {
        int[] nuemeros = {11,12,31,11,2,7,11};

        for (int i = 0; i < nuemeros.length; i++) {
            if(i==0||nuemeros[i]!=nuemeros[i-1]){
                System.out.print(nuemeros[i] + " ");
            }
        }
    }
}
