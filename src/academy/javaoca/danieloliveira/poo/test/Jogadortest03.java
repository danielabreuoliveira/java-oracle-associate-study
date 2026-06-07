package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Jogador;
import academy.javaoca.danieloliveira.poo.dominio.Time;

public class Jogadortest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("------------------------- jogador____________");

        jogador.imprime();

        System.out.println("------------------------- time ------");

        time.imprime();

    }
}
