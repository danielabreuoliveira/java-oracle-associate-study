package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Jogador;
import academy.javaoca.danieloliveira.poo.dominio.Time;

public class Jogador02Test {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Dinamite");
        Time time = new Time("Vasco da gama");

        jogador.setTime(time);
        jogador.imprime();
    }
}
