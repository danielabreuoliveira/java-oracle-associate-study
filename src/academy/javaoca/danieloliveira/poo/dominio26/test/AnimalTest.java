package academy.javaoca.danieloliveira.poo.dominio26.test;

import academy.javaoca.danieloliveira.poo.dominio26.dominio.Animal;
import academy.javaoca.danieloliveira.poo.dominio26.dominio.Cachorro;
import academy.javaoca.danieloliveira.poo.dominio26.dominio.Gato;
import academy.javaoca.danieloliveira.poo.dominio26.dominio.Vaca;
import academy.javaoca.danieloliveira.poo.dominio26.servico.ImpressoraAnimal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cachorro("Lessi", 5),
                new Cachorro("Birrao", 3),
                new Gato("Machimelo", 7),
                new Gato("Machimelo.jr", 5),
                new Vaca("Ferndinando", 3),
                new Vaca("Julia.jr", 1),
        };
        for (Animal animal : animals) {
            ImpressoraAnimal.imprimirRelatorio(animal);
            System.out.println("-------///////--------");
            System.out.println();
        }

    }
}
