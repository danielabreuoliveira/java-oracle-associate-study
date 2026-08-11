package academy.javaoca.danieloliveira.fundamentos.vetores.estruturaDados.teste;
import academy.javaoca.danieloliveira.fundamentos.vetores.estruturaDados.Vetor;

public class VetorTeste03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.busca("elemento 1"));
        System.out.println(vetor.busca("elemento 1"));
    }
}
