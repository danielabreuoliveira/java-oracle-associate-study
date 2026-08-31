package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste85 {
    public int soma(int n1, int n2){
        return n1+n2;
    }
    public double soma(double n1, double n2){
        return n1+n2;
    }
    public static void main(String[] args) {

        Teste85 teste85 = new Teste85();

        System.out.println(teste85.soma(1,2));
        System.out.println(teste85.soma(3.1,3.3));
    }
}
