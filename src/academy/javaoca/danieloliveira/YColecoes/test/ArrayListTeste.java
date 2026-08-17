package academy.javaoca.danieloliveira.YColecoes.test;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTeste {
    public static void main(String[] args) {


        List<String> times = new ArrayList<>();

        times.add("Flamengo");
        times.add("Palmeiras");
        times.add("Cruzeiro");
        times.add("Mirassol");
        times.add("Fluminense");
        times.add("Bahia");
        times.add("Botafogo");
        times.add("São Paulo");
        times.add("Red Bull Bragantino");
        times.add("Corinthians");
        times.add("Grêmio");
        times.add("Vasco");
        times.add("Atlético-MG");
        times.add("Santos");
        times.add("Vitória");
        times.add("Internacional");
        times.add("Coritiba");
        times.add("Athletico-PR");
        times.add("Chapecoense");
        times.add("Remo");

        System.out.println("\n Times serie A");

        for (String time : times) {
            System.out.println(time);
        }

        System.out.println("\n quantidade de times: " + times.size());
    }
}