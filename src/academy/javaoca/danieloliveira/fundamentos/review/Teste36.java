package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste36 {
    public static void main(String[] args) {
        int numeros[] = new int[3];

        numeros[0] = 2;
        numeros[1] = 3;
        numeros[2] = 4;

        int contadorNumerosPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2 == 0){
                contadorNumerosPares++;
            }
        }
        System.out.println("Quantidade de numeros pares: " + contadorNumerosPares);
    }
}
