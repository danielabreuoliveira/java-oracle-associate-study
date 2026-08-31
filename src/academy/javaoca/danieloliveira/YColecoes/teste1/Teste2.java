package academy.javaoca.danieloliveira.YColecoes.teste1;

import java.util.HashMap;
import java.util.Map;

public class Teste2 {
    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();

        produtos.put("Arroz", 22.90);
        produtos.put("Feijao", 11.70);
        produtos.put("Macarrao", 17.50);
        produtos.put("Café", 29.90);
        produtos.put("Açucar", 29.90);

        for (Map.Entry<String, Double> produto: produtos.entrySet()){
            System.out.println(produto.getKey() + " - " + produto.getValue());
        }
    }
}
