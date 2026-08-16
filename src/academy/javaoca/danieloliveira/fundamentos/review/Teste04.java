package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste04 {
    public double calcularFrete(double peso, double distancia){
        return peso * distancia * 0.5;
    }

    public static void main(String[] args) {

        Teste04 calcularFrete1 = new Teste04();
        Teste04 calcularFrete2 = new Teste04();

        double frete01 = calcularFrete1.calcularFrete(1.75, 10.0);
        double frete02 = calcularFrete2.calcularFrete(1.0, 300);
        System.out.println("Frete produto 1: " + frete01);
        System.out.println("Frete produto 2: " + frete02);
    }
}
