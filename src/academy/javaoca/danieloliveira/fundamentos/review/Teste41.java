package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste41 {
    public static void main(String[] args) {
        int [] numeros = {10,25,30,48,50};

        int procurado = 48;

        boolean encontrado = false;

        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] == procurado){
                encontrado = true;
                System.out.println("Indice: " + i);
            }
        }
        if(encontrado){
            System.out.println("O numero foi encontrado? " + encontrado);
            System.out.println("Qual o valor? " + procurado);
        }else {
            System.out.println("Valor nao encontrado");
        }
    }
}
