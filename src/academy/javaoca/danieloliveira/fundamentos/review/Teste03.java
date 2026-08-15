package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste03 {
    public static void main(String[] args) {
        double notas[] = {5.5, 4.4, 5.6};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double mediaTurma =  soma/ notas.length;
        System.out.println("a soma dos valores: " + soma);
        System.out.println("a media das notas: " + mediaTurma);
    }
}
