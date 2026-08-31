package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste80 {
    public static void main(String[] args) {
        String nome = "Daniel";

        System.out.print("String normal: " + nome);
        String  invertida = "";

        for (int i = nome.length()-1; i >=0; i--) {
            invertida = invertida + nome.charAt(i);
        }

        System.out.print("\nString invertida: " + invertida);
    }
}
