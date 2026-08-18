package academy.javaoca.danieloliveira.YColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTeste {

    public static void main(String[] args) {

        List<String> times = new ArrayList<>();

        // ==============================
        // 1. ADICIONANDO ELEMENTOS
        // ==============================

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

        System.out.println("\n========== LISTA ORIGINAL ==========");

        for (String time : times) {
            System.out.println(time);
        }


        // ==============================
        // 2. SIZE
        // ==============================

        System.out.println("\nQuantidade de times: " + times.size());


        // ==============================
        // 3. CONTAINS
        // ==============================

        System.out.println("\nVasco está na lista? "
                + times.contains("Vasco"));

        System.out.println("Goiás está na lista? "
                + times.contains("Goiás"));


        // ==============================
        // 4. INDEXOF
        // ==============================

        System.out.println("\nPosição do Vasco: "
                + times.indexOf("Vasco"));

        System.out.println("Posição do Flamengo: "
                + times.indexOf("Flamengo"));


        // ==============================
        // 5. GET
        // ==============================

        System.out.println("\nTime da posição 5: "
                + times.get(5));


        // ==============================
        // 6. SET
        // ==============================

        times.set(5, "Goiás");

        System.out.println("\nDepois de substituir o time da posição 5:");

        System.out.println(times);


        // ==============================
        // 7. REMOVE POR OBJETO
        // ==============================

        times.remove("Remo");

        System.out.println("\nDepois de remover o Remo:");

        System.out.println(times);


        // ==============================
        // 8. REMOVE POR ÍNDICE
        // ==============================

        times.remove(0);

        System.out.println("\nDepois de remover o elemento da posição 0:");

        System.out.println(times);


        // ==============================
        // 9. ADICIONAR EM UMA POSIÇÃO
        // ==============================

        times.add(0, "Flamengo");

        System.out.println("\nDepois de adicionar Flamengo na posição 0:");

        System.out.println(times);


        // ==============================
        // 10. ADDALL
        // ==============================

        List<String> novosTimes = new ArrayList<>();

        novosTimes.add("Sport");
        novosTimes.add("Ceará");

        times.addAll(novosTimes);

        System.out.println("\nDepois de adicionar outra lista:");

        System.out.println(times);


        // ==============================
        // 11. CONTAINSALL
        // ==============================

        System.out.println("\nA lista contém todos os novos times? "
                + times.containsAll(novosTimes));


        // ==============================
        // 12. SORT
        // ==============================

        Collections.sort(times);

        System.out.println("\n========== LISTA ORDENADA ==========");

        for (String time : times) {
            System.out.println(time);
        }


        // ==============================
        // 13. REVERSE
        // ==============================

        Collections.reverse(times);

        System.out.println("\n========== LISTA INVERTIDA ==========");

        System.out.println(times);


        // ==============================
        // 14. SHUFFLE
        // ==============================

        Collections.shuffle(times);

        System.out.println("\n========== LISTA EMBARALHADA ==========");

        System.out.println(times);


        // ==============================
        // 15. MIN
        // ==============================

        String menor = Collections.min(times);

        System.out.println("\nMenor elemento alfabeticamente: "
                + menor);


        // ==============================
        // 16. MAX
        // ==============================

        String maior = Collections.max(times);

        System.out.println("Maior elemento alfabeticamente: "
                + maior);


        // ==============================
        // 17. FREQUENCY
        // ==============================

        times.add("Flamengo");
        times.add("Flamengo");

        int quantidadeFlamengo =
                Collections.frequency(times, "Flamengo");

        System.out.println("\nQuantidade de Flamengos na lista: "
                + quantidadeFlamengo);


        // ==============================
        // 18. LASTINDEXOF
        // ==============================

        System.out.println("\nÚltima posição do Flamengo: "
                + times.lastIndexOf("Flamengo"));


        // ==============================
        // 19. IS EMPTY
        // ==============================

        System.out.println("\nA lista está vazia? "
                + times.isEmpty());


        // ==============================
        // 20. SIZE
        // ==============================

        System.out.println("\nTamanho final da lista: "
                + times.size());


        // ==============================
        // 21. ITERANDO COM FOR
        // ==============================

        System.out.println("\n========== FOR TRADICIONAL ==========");

        for (int i = 0; i < times.size(); i++) {
            System.out.println(
                    i + " - " + times.get(i)
            );
        }


        // ==============================
        // 22. ITERANDO COM FOR EACH
        // ==============================

        System.out.println("\n========== FOR EACH ==========");

        for (String time : times) {
            System.out.println(time);
        }


        // ==============================
        // 23. LIMPAR LISTA
        // ==============================

        List<String> copia = new ArrayList<>(times);

        System.out.println("\nQuantidade antes do clear: "
                + copia.size());

        copia.clear();

        System.out.println("Quantidade depois do clear: "
                + copia.size());

        System.out.println("Lista está vazia? "
                + copia.isEmpty());
    }
}