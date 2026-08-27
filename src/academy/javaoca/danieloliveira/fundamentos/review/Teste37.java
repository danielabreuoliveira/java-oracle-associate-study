package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste37 {
    public static void main(String[] args) {
        int numeros[] = {10,20,30,40,50};
        int valor = 30;

        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] == valor){
                System.out.println("Valor encontrado!");
                System.out.println("Indice: " + i);
            }
        }
    }
}
