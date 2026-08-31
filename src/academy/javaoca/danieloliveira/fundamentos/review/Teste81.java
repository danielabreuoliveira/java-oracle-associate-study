package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste81 {
    public double somar(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {

        Teste81 teste81 = new Teste81();
        teste81.somar(31,2);
        teste81.somar(11,33);

        System.out.println(teste81.somar(31,2));
        System.out.println(teste81.somar(3,2));

    }
}
