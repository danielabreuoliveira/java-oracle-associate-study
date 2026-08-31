package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste79 {
    public static void main(String[] args) {
        String nome = "ovo";

        int inicio = 0;
        int fim = nome.length()-1;

        boolean palindromo = true;

        do {
            if(nome.charAt(inicio)!=nome.charAt(fim)){
                palindromo = false;
            }
            inicio++;
            fim--;
        }while (inicio<fim);

        if(palindromo){
            System.out.println("O nome " + nome + " é palindromo");
        }else{
            System.out.println("O nome " + nome + " não é um palindromo");
        }

    }
}
