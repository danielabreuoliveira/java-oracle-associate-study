package academy.javaoca.danieloliveira.YColecoes;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
/**
        List<String> nomes = new ArrayList<>();
        List<String> copia = new ArrayList<>(nomes);

        nomes.add("Daniel");
        nomes.add(1,"Maria");
        nomes.get(0);
        nomes.set(0,"Pedro");
        nomes.remove(0);

        System.out.println(nomes);
        System.out.println(nomes.get(0));
        System.out.println(nomes.size());
        System.out.println(nomes.contains("Daniel"));
*/
        List<String> timesSerieA =new ArrayList<>();

        timesSerieA.add("Flamengo");
        timesSerieA.add("Vasco");
        timesSerieA.add("Botafogo");
        timesSerieA.add("Fluminenses");
        timesSerieA.add("Corinthians");
        timesSerieA.add("Palmeiras");
        timesSerieA.add("Santos");
        timesSerieA.add("Sao Paulo");

        for (int i = 0; i < timesSerieA.size(); i++) {
                System.out.println(i + " - " + timesSerieA.get(i));
            }
    }
}
