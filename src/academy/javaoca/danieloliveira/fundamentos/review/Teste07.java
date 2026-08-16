package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste07 {

    public double converterTemperatura(double c){
        return c*1.8+32;
    }
    public static void main(String[] args) {
        Teste07 temperatura = new Teste07();

        double f = temperatura.converterTemperatura(30);
        System.out.println("valor em Fahrenheit: " + f + "F");
    }
}
