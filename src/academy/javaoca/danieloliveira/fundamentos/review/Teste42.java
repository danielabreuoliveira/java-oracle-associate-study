package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste42 {
    public static void main(String[] args) {
        int[] numeros = {7,15,22,31,48,60};

        int procurado = 48;

        boolean encontrado = false;

        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] == procurado){
                encontrado = true;
                System.out.println("O numero encontrado está no indice " + i);
            }
        }
        if(encontrado){
            System.out.println("Valor foi encontrado ? " + encontrado);
            System.out.println("Qual o valor que foi procurado? " + procurado);
        }else {
            System.out.println("Valor não encontrado");
        }
    }
}
