package academy.javaoca.danieloliveira.poo.dominio29.servico;

import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Ligavel;

public class Oficina {
    public static void testarVeiculo (Ligavel ligavel){
        System.out.println("Ligando ...." + ligavel.ligar());
        System.out.println("Desligando ...." + ligavel.desligar());
    }
}
