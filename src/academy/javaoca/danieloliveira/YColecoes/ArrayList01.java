package academy.javaoca.danieloliveira.YColecoes;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

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

    }
}
