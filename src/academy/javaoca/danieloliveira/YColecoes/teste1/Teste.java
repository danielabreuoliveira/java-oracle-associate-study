package academy.javaoca.danieloliveira.YColecoes.teste1;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Adson");
        nomes.add("Brenner");
        nomes.add("Paulo Herinque");
        nomes.add("Tche Tche");
        nomes.add("Sosa");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
