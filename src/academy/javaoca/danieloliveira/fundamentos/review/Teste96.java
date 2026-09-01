package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste96 {
    public static void main(String[] args) {
        int[] numeros = {1,2,2};

        int contadorPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                contadorPares++;
            }
        }

        System.out.println("Quantidade de numeros pares: " + contadorPares);
    }
}
