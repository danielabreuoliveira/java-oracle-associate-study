package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste73 {
    static void main(String[] args) {
        int[] numeros = {1,2,2};

        int qtdPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                qtdPares++;
            }
        }
        System.out.println("Quantidade de numeros pares: " + qtdPares);
    }
}
