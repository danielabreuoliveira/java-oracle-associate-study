package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romario");
        Jogador jogador2 = new Jogador("Edmundo");
        Jogador jogador3 = new Jogador("Dinamite");

        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
