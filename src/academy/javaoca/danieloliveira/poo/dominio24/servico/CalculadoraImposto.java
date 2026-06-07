package academy.javaoca.danieloliveira.poo.dominio24.servico;

import academy.javaoca.danieloliveira.poo.dominio24.dominio.Computador;
import academy.javaoca.danieloliveira.poo.dominio24.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto: " + imposto);
    }

}
