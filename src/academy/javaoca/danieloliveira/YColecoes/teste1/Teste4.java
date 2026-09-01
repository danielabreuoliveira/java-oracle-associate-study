package academy.javaoca.danieloliveira.YColecoes.teste1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Teste4 {
    public static void main(String[] args) {
        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Arroz", 21.88);
        produtos.put("Feijao", 11.88);
        produtos.put("Macarrao", 7.88);
        produtos.put("Café", 6.88);

        for (Map.Entry<String, Double> produto: produtos.entrySet()){
            System.out.println(produto.getKey() + " - " + produto.getValue());
        }
    }
}
