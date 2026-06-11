package academy.javaoca.danieloliveira.poo.dominio35.dominio;

import academy.javaoca.danieloliveira.poo.dominio35.repositorio.Ligavel;
import academy.javaoca.danieloliveira.poo.dominio35.repositorio.Tarifavel;

public class Onibus extends Transporte implements Ligavel, Tarifavel {
    public Onibus(String modelo, int capacidadePassageiros, TipoCombustivel tipoCombustivel) {
        super(modelo, capacidadePassageiros, tipoCombustivel);
    }

    @Override
    public void ligar() {
        System.out.println("Onibus ligado ....");
    }

    @Override
    public void desligar() {
        System.out.println("Onibus desligado ....");
    }

    @Override
    public double calcularTarifa() {
        return 4.50*getCapacidadePassageiros();
    }
}
