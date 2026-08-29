package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste52 {
    public static void main(String[] args) {
        String nome = "Daniel";

        int contadorVogal = 0;

        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i)=='e'||
                    nome.charAt(i)=='a'||
                    nome.charAt(i)=='i'||
                    nome.charAt(i)=='o'||
                    nome.charAt(i)=='u'){
                contadorVogal++;
            }
        }
        System.out.println("A palavra: " + nome + " possui " + contadorVogal + " vogais");
    }
}
