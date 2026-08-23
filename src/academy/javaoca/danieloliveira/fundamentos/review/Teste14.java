package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste14 {
    public static void main(String[] args) {

        String palavra = "42";
        int numeroString = Integer.parseInt(palavra);

        double numero = 9.0;
        int numeroDouble = (int) numero;

        System.out.println("Palavra convertida para int: " + numeroString);
        System.out.println("Double convertido para int: " + numeroDouble);
    }
}
