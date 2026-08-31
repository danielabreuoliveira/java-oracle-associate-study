package academy.javaoca.danieloliveira.YColecoes.teste1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Teste3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(1);
        numeros.add(3);
        numeros.add(7);

        HashSet<Integer> numerosSemDuplicados = new HashSet<>(numeros);

        System.out.println(numerosSemDuplicados);

        List<String> times = new ArrayList<>();

        times.add("Vasco");
        times.add("Vasco");
        times.add("Vasco");
        times.add("Vasco");
        times.add("Vasco");
        times.add("Vasco");
        times.add("Flamengo");

        HashSet<String> timesSemDuplicados = new HashSet<>(times);

        System.out.println(timesSemDuplicados);


    }
}
