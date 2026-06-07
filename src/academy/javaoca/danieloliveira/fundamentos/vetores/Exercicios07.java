package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios07 {
public static void main(String[] args) {
        int[] vetorGenerico = {1,2,3,4,5,6};

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < vetorGenerico.length; i++) {
            if(vetorGenerico[i] % 2 == 0){
                contadorPar = contadorPar + 1;
            }else{
                contadorImpar = contadorImpar +1;
            }
        }

    System.out.println("Quantidade de elementos pares é " + contadorPar);
    System.out.println("Quantidade de elementos impares é " + contadorImpar);

}
}
