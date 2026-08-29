package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste53 {
    public static void main(String[] args) {
        String nome = "daniel";

        int inicio = 0;
        int fim = nome.length()-1;

        boolean palindromo = true;
/*
        for (int inicio = 0; inicio<fim;) {
                if(nome.charAt(inicio)!=nome.charAt(fim)){
                        palindromo = false;
                }
            inicio++;
            fim--;
        }
        */
        do{
            if(nome.charAt(inicio)!=nome.charAt(fim)){
                palindromo = false;
            }
            inicio++;
            fim--;
        }while (inicio<fim);

        if(palindromo){
            System.out.println("A palavra: " + nome + " é um palindromo");
        }else {
            System.out.println("A palavra: " + nome + " não é um palindromo");
        }
    }
}
