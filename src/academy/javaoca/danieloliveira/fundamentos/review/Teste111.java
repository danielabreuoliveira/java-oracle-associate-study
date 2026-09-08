package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste111 {
    public static void main(String[] args) {
        String nome = "ovo";

        int inicio = 0;
        int fim = nome.length()-1;

        boolean palindrommo = true;

        do{
            if(nome.charAt(inicio)!=nome.charAt(fim)){
                palindrommo = false;
            }
            inicio++;
            fim--;
        }while (inicio<fim);

        if(palindrommo){
            System.out.println("A palavra: " + nome + " é palidromo");
        }else {
            System.out.println("A palavar " + nome + " não é palindromo");
        }
    }
}
