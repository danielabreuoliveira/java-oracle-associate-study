package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste40 {
    public static void main(String[] args) {
        int [] numeros = {10,25,30,45,50};

        int procurado = 30;

        boolean encontrado = false  ;

        for (int i = 0; i < numeros.length ; i++) {
               if(numeros[i] == procurado){
                   encontrado = true;
                   System.out.println("Indice: " + i);
               }
           }
        if(encontrado){
            System.out.println("valor encontrado: " + procurado);
        }else {
            System.out.println("valor nao encontrado");
        }
    }
}
