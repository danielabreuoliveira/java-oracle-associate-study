package academy.javaoca.danieloliveira.YColecoes.teste1;

import java.util.ArrayList;
import java.util.List;

public class Teste1 {
    public static void main(String[] args) {
        List<String> times = new ArrayList<>();

        times.add("Vasco");
        times.add("Flamengo");
        times.add("Fluminense");
        times.add("Botafogo");

        times.remove("Flamengo");
        times.remove(2);

        for (int i = 0; i < times.size(); i++) {
            System.out.println(times.get(i));
        }


    }
}
