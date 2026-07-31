package academy.javaoca.danieloliveira.fundamentos.vetores.estruturaDados.teste;

import academy.javaoca.danieloliveira.fundamentos.vetores.estruturaDados.Vetor;

public class VetorTeste01 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);


        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
