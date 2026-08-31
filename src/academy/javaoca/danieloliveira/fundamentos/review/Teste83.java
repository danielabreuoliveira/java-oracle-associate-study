package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste83 {
    public int maior(int n1, int n2, int n3){
        if(n1>n2&&n1>n3){
            System.out.println("O primeiro é maior");
            return n1;
        } else if (n2>n1&&n2>n3) {
            System.out.println("O segundo é maior");
            return n2;
        } else {
            System.out.println("O terceiro é maior");
            return n3;
        }
    }

    public static void main(String[] args) {

        Teste83 teste83 = new Teste83();

        System.out.println(teste83.maior(1,33,332));

    }
}
