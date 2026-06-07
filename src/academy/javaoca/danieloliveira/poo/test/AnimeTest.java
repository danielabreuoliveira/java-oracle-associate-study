package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Anime;

public class AnimeTest {
    static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto","TV", 122);
        anime.init("Naruto","TV", 122, "japones");
        anime.imprime();

    }
}
