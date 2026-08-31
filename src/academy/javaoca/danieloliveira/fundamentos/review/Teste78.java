package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste78 {
    public static void main(String[] args) {
        String frase = "Vasco campeao do mundo";

        int contadorVogais = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
                contadorVogais ++;
            }
        }

        System.out.println("A frase:  " + frase + " possui: " + contadorVogais + " de vogais");
    }
}
