package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste40 {
    public static void main(String[] args) {
        int [] numeros = {10,25,30,45,50};

        int procurado = 30;

        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] == procurado){
                procurado = numeros[i];
                System.out.println("Valor encontrado: " + procurado);
                System.out.println("Indice: " + i);
            }
        }
    }
}
