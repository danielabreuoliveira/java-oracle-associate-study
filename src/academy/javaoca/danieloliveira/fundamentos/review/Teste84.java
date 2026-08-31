package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste84 {
    public void imprimirLinha(int tamanho){
        for (int i = 0; i < tamanho ; i++) {
            System.out.print('*');
        }

        System.out.println();
    }
    public static void main(String[] args) {

        Teste84 teste84 = new Teste84();

        teste84.imprimirLinha(11);
        teste84.imprimirLinha(31);
    }
}
