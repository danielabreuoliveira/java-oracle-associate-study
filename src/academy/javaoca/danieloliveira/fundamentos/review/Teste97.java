package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste97 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};

        int procurado = 3;

        boolean encontrado = false;

        for (int i = 0; i < numeros.length ; i++) {
            if(procurado==numeros[i]){
                encontrado = true;
                System.out.println("Numero: " + procurado + " Indice: " + i);
            }
        }
    }
}
