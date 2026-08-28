package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste47 {
    public static void main(String[] args) {
        int[] numeros = {10,30,40,55,71};

        int procurado = 40;

        boolean  encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == procurado){
                encontrado = true;
                System.out.println("O indice do numero encontrado é: " + i);
            }
        }
        if(encontrado){
            System.out.println("O numero encontrado é: " + procurado);
        }else {
            System.out.println("Numero não encontrado!");
        }
    }
}
