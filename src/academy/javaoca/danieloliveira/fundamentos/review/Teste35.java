package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste35 {
    public static void main(String[] args) {
        int numeros[] = new int[3];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;


        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if(maior<numeros[i]){
                maior = numeros[i];
            } else if (menor>numeros[i]) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
