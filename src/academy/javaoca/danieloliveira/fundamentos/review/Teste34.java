package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste34 {
    public static void main(String[] args) {
        int numeros[] = new int[3];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        int somaValores = 0;
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            somaValores += numeros[i];
            media = somaValores/ numeros.length;
        }

        System.out.println("Soma dos valores: " + somaValores);
        System.out.println("Valor da media: " + media);
    }
}
