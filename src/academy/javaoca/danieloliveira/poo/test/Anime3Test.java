package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Anime3;

public class Anime3Test {
    public static void main(String[] args) {
        Anime3 anime = new Anime3("one piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
