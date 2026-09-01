package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste97 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};

        int procurado = 3;

        boolean encontrado = true;

        for (int i = 0; i < numeros.length ; i++) {
            if(procurado==numeros[i]){
                System.out.println(" Indice: " + i);
            }
        }
        if(encontrado){
            System.out.println("Numero encontrado: " + procurado);
        }else{
            System.out.println("numero nao encontrado: ");
        }
    }
}
