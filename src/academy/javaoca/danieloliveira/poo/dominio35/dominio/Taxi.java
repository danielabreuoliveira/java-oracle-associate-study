package academy.javaoca.danieloliveira.poo.dominio35.dominio;

import academy.javaoca.danieloliveira.poo.dominio35.repositorio.Ligavel;
import academy.javaoca.danieloliveira.poo.dominio35.repositorio.Tarifavel;

public class Taxi extends Transporte implements Ligavel, Tarifavel {
    public Taxi(String modelo, int capacidadePassageiros, TipoCombustivel tipoCombustivel) {
        super(modelo, capacidadePassageiros, tipoCombustivel);
    }

    @Override
    public void ligar() {
        System.out.println("Taxi ligado ....");
    }

    @Override
    public void desligar() {
        System.out.println("Taxi desligado ....");
    }

    @Override
    public double calcularTarifa() {
        return 7.00 * getCapacidadePassageiros();
    }
}
