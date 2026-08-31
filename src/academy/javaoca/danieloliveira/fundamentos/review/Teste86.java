package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste86 {
    public void ordernar(int[] numeros){
        for (int j = 0; j < numeros.length-1; j++) {
            for (int i = 0; i < numeros.length-1; i++) {
            if(numeros[i]>numeros[i+1]){
                int intervalo = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = intervalo;
            }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
    public static void main(String[] args) {
            Teste86 teste86 = new Teste86();

            int[] numeros = {1,3,4,5,77,2,7,33,11};

            teste86.ordernar(numeros);
    }
}
