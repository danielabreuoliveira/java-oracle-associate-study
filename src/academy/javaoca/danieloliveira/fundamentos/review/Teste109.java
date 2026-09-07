package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste109 {
    public static void main(String[] args) {
        String nome = "Daniel";

        int contaVogal = 0;
        for (int i = 0; i < nome.length() ; i++) {
            if(nome.charAt(i) == 'a'||nome.charAt(i) == 'e'||nome.charAt(i) == 'i'||nome.charAt(i) == 'o'||nome.charAt(i) == 'u'){
                contaVogal ++;
            }
        }

        System.out.println("Quantidade de vogais: " + contaVogal);
    }
}
