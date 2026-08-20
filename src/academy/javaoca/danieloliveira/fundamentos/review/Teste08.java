package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.ArrayList;
import java.util.Collections;

public class Teste08 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        // 1. Adicionar elementos
        nomes.add("Daniel");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Ana");

        System.out.println("Lista: " + nomes);

        // 2. Adicionar em uma posição específica
        nomes.add(2, "Pedro");
        System.out.println("Depois do add(index): " + nomes);

        // 3. Tamanho da lista
        System.out.println("Tamanho: " + nomes.size());

        // 4. Acessar elemento
        System.out.println("Elemento índice 0: " + nomes.get(0));

        // 5. Alterar elemento
        nomes.set(0, "Daniel Oliveira");
        System.out.println("Depois do set: " + nomes);

        // 6. Verificar se contém
        System.out.println("Contém Maria? " + nomes.contains("Maria"));

        // 7. Descobrir posição
        System.out.println("Índice da Maria: " + nomes.indexOf("Maria"));

        // 8. Descobrir última posição
        nomes.add("Maria");
        System.out.println("Último índice da Maria: " + nomes.lastIndexOf("Maria"));

        // 9. Remover pelo índice
        nomes.remove(1);
        System.out.println("Depois do remove(index): " + nomes);

        // 10. Remover pelo objeto
        nomes.remove("Carlos");
        System.out.println("Depois do remove(objeto): " + nomes);

        // 11. Verificar se está vazia
        System.out.println("Está vazia? " + nomes.isEmpty());

        // 12. Ordenar
        Collections.sort(nomes);
        System.out.println("Ordenada: " + nomes);

        // 13. Inverter
        Collections.reverse(nomes);
        System.out.println("Invertida: " + nomes);

        // 14. Percorrer com for
        System.out.println("\nFor tradicional:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // 15. Percorrer com for-each
        System.out.println("\nFor-each:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // 16. Limpar toda a lista
        nomes.clear();
        System.out.println("\nDepois do clear: " + nomes);

        // 17. Verificar novamente
        System.out.println("Está vazia? " + nomes.isEmpty());
    }
}