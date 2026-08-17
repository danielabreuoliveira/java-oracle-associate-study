package academy.javaoca.danieloliveira.YColecoes.test;
import java.util.ArrayList;
import java.util.Collections;
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

        System.out.println("\n ----------  Times serie A -------------");

        for (String time : times) {
            System.out.println(time);
        }

        System.out.println("\nQuantidade de times: " + times.size());

        if (times.contains("Vasco")){
            System.out.println("Vasco esta na lista");
        } else{
            System.out.println("Vasco nao esta na lista");
        }

        times.remove("Remo");

        System.out.println("\nDepois de remover o Remo:");
        System.out.println(times);


        // 5. Adicionar Goiás
        times.add("Goiás");

        System.out.println("\nDepois de adicionar Goiás:");
        System.out.println(times);

        System.out.println("\nTime da posição 5: " + times.get(5));

        Collections.sort(times);

        System.out.println("\n=== TIMES ORDENADOS ===");

        for (String time : times) {
            System.out.println(time);
        }

        System.out.println("\n=== LISTA FINAL ===");

        for (int i = 0; i < times.size(); i++) {
            System.out.println(i + " - " + times.get(i));
        }

    }
}