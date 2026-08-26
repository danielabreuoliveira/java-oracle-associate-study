package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste31 {
    public static void main(String[] args) {

        int numero = 1;

       do{
           if(numero%7 == 0){
               System.out.println("O numero é divisivel por 7: " +numero);
               break;
           }
           numero++;

       }while(numero<=100);
    }
}
