package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste46 {
    public static void main(String[] args) {
        int[] numeros = {10,21,30,43,50};

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2!=0){
                System.out.println(numeros[i]);
            }
        }
    }
}
