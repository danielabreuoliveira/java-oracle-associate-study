package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste74 {
    public static void main(String[] args) {
        int[] numeros = {2,3,5};

        int procurado = 3;

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==procurado){
                encontrado = true;
                System.out.println("Numero encontrado no indice: " + i);
            }
        }
        if(encontrado){
            System.out.println("O numero procurado foi: " + procurado);
        }else{
            System.out.println("Numero não encontrado!");
        }
    }
}
