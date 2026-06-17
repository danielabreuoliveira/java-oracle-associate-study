package academy.javaoca.danieloliveira.exceptions.runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {

           divisao(1, 0);

        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
