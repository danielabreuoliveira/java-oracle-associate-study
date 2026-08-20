package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.ArrayList;
import java.util.Collections;

public class Teste09 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        // ADICIONANDO
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Lista: " + numeros);

        // ADICIONAR EM UMA POSIÇÃO
        numeros.add(2, 25);

        System.out.println("Depois do add(index): " + numeros);

        // TAMANHO
        System.out.println("Tamanho: " + numeros.size());

        // PEGAR ELEMENTO
        System.out.println("Elemento índice 3: " + numeros.get(3));

        // ALTERAR ELEMENTO
        numeros.set(0, 100);

        System.out.println("Depois do set: " + numeros);

        // VERIFICAR SE EXISTE
        System.out.println("Contém 30? " + numeros.contains(30));

        // VERIFICAR SE NÃO EXISTE
        System.out.println("Contém 90? " + numeros.contains(90));

        // PRIMEIRA OCORRÊNCIA
        System.out.println("Índice do 30: " + numeros.indexOf(30));

        // ÚLTIMA OCORRÊNCIA
        numeros.add(30);

        System.out.println("Último índice do 30: "
                + numeros.lastIndexOf(30));

        // REMOVER PELO ÍNDICE
        numeros.remove(1);

        System.out.println("Depois do remove(index): " + numeros);

        // REMOVER PELO OBJETO
        numeros.remove(Integer.valueOf(40));

        System.out.println("Depois do remove(objeto): " + numeros);

        // ORDENAR
        Collections.sort(numeros);

        System.out.println("Ordenada: " + numeros);

        // INVERTER
        Collections.reverse(numeros);

        System.out.println("Invertida: " + numeros);

        // MAIOR VALOR
        System.out.println("Maior: " + Collections.max(numeros));

        // MENOR VALOR
        System.out.println("Menor: " + Collections.min(numeros));

        // EMBARALHAR
        Collections.shuffle(numeros);

        System.out.println("Embaralhada: " + numeros);

        // PERCORRENDO COM FOR
        System.out.println("\nFOR:");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // PERCORRENDO COM FOR-EACH
        System.out.println("\nFOR-EACH:");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // SUBLIST
        ArrayList<Integer> parte =
                new ArrayList<>(numeros.subList(0, 2));

        System.out.println("\nSublista: " + parte);

        // LIMPAR
        numeros.clear();

        System.out.println("Depois do clear: " + numeros);

        // VERIFICAR SE ESTÁ VAZIA
        System.out.println("Está vazia? " + numeros.isEmpty());
    }
}

