package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios05 {
    public static void main(String[] args) {
        int[] arrayMenorNumero = {5,9,2,20,1};

        int menor = arrayMenorNumero[0];

        for (int i = 0; i < arrayMenorNumero.length; i++) {
            if(arrayMenorNumero[i]<menor){
                menor = arrayMenorNumero[i];
            }
        }
        System.out.println(menor);
        }
}
