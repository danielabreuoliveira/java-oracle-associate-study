package academy.javaoca.danieloliveira.poo.dominio26.servico;

import academy.javaoca.danieloliveira.poo.dominio26.dominio.Animal;

public class ImpressoraAnimal {
    public static void imprimirRelatorio(Animal animal){
        System.out.println("Relatorio Animal");
        String som = animal.emitirSom();
        String dormir = animal.dormir();
        System.out.println("Animal: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Som que faz: " + som);
        System.out.println("Dormir: " + dormir);
    }
}
