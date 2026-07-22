package academy.javaoca.danieloliveira.YColecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Daniel");
        nomes.add("joao");

        nomes.remove("joao");
        boolean nomeContem = nomes.contains("Daniel");
        int nomeTamanho = nomes.size();

        System.out.println(nomes);
        System.out.println("Contém o nome na lista: " + nomeContem );
        System.out.println(nomeTamanho);

    }
}
