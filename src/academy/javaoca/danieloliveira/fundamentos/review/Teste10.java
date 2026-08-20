package academy.javaoca.danieloliveira.fundamentos.review;

import java.util.ArrayList;
import java.util.Collections;

public class Teste10 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros =  new ArrayList<>();

        numeros.add(5);
        numeros.add(11);

        System.out.println("Lista: " + numeros);

        int somaNumeros = 0;
        for (Integer numero : numeros) {
            somaNumeros += numero;
        }

        System.out.println(somaNumeros);
    }
}
